$("body").on({
	// When ajaxStart is fired, add 'loading' to body class
	ajaxStart : function() {
		$(this).addClass("loading");
	},
	// When ajaxStop is fired, rmeove 'loading' from body class
	ajaxStop : function() {
		$(this).removeClass("loading");
	}
});
var generic = {
	"getList" : function(entity, parameters) {
		var action = entity + '/form/list';
		this.executeHtml('GET', action, function() {
			generic.get(entity, parameters, generic.showInformation);
		});
	},
	"getForm" : function(entity, item) {
		if (item) {
			var action = entity + '/form/edit';
			this.executeHtml('GET', action, function() {
				generic.get(entity, item, generic.showInformation);
			});
		} else {
			var action = entity + '/form/new';
			this.executeHtml('GET', action, null);
		}
	},
	"getDetail" : function(entity, item) {
		var action = entity + '/form/detail';
		this.executeHtml('GET', action, function() {
			generic.get(entity, item, generic.showInformation);
		});
	},
	"get" : function(entity, item, callback) {
		var action = entity;
		if (item && item != null) {
			if (typeof item == "object") {
				action += "?";
				var count = 1;
				for ( var o in item) {
					if (count > 1)
						action += "&";
					action += o + "=" + item[o];
					count++;
				}
				params = item;
			} else {
				action += '/' + item;
			}
		}
		this.executeJSon('GET', action, null, callback);
	},
	"post" : function(action, params, callback) {
		this.executeJSon('POST', action, params, callback);
	},
	"put" : function(action, params, callback) {
		this.executeJSon('PUT', action, params, callback);
	},
	"delete" : function(entity, id, callback) {
		var params = {
			'id' : id
		};
		this.executeJSon('DELETE', entity + '/' + id, params, callback);
	},
	"executeJSon" : function($method, action, data, callback) {
		if(action.indexOf("busqueda")==-1){
			$("body").addClass("loading");
		}
		if (data != null) {
			data = JSON.stringify(data);
		}
		$.ajaxSetup({
			headers : {
				"Content-Type" : 'application/json',
				"Accept" : 'application/json'
			}
		});
		$.ajax({
			type : $method,
			url : action,
			data : data,
			dataType : 'json',
			success : function(response) {
				if ($method == 'GET') {
					if (callback) {
						var param = new Array();
						param.push(response);
						callback.apply(this, param);
					}
				} else {
					var cabeceraMensaje;
					if (response.correcto) {
						cabeceraMensaje = 'Operaci&oacute;n correcta';
					} else {
						cabeceraMensaje = 'Operaci&oacute;n incorrecta';
					}
					jAlert(response.mensaje, cabeceraMensaje);
					if (response.correcto) {
						if (callback) {
							var param = new Array();
							param.push(response);
							callback.apply(this, param);
						}
					}
				}
			},
			error : function(e) {
				var message = 'Se ha producido un error al procesar la acci&oacute;n';
				switch (e.status) {
				case 404:
					message = 'La p&aacute;gina a la que intenta acceder no existe';
					break;
				case 403:
					message = 'No tiene permisos para acceder a esta funcionalidad';
					break;
				}
				jAlert(message, 'Error');
			},
			complete : function() {
				if(action.indexOf("busqueda")==-1){
					$("body").removeClass("loading");
				}
			}
		});
	},
	"executeHtml" : function($method, action, callback) {
		$("body").addClass("loading");
		$.ajaxSetup({
			headers : {
				"Content-Type" : 'text/html; charset=UTF-8',
				"Accept" : 'text/html; charset=UTF-8'
			}
		});
		$.ajax({
			type : $method,
			url : action,
			dataType : 'html',
			success : function(response) {
				if (response.indexOf('Pantalla de acceso al sistema') != -1) {
					jAlert(
							'Ha finalizado la sesi&oacute;n. Por favor, vuelva a acceder al sistema',
							'Finalizaci&oacute;n de sesi&oacute;n',
							function() {
								window.location.reload(true);
							});
				} else {
					$('#content').html(response);
					if (callback) {
						callback.apply(this, arguments);
					}
				}
			},
			error : function(e) {
				var message = 'Se ha producido un error al procesar la acci&oacute;n';
				switch (e.status) {
				case 404:
					message = 'La p&aacute;gina a la que intenta acceder no existe';
					break;
				case 403:
					message = 'No tiene permisos para acceder a esta funcionalidad';
					break;
				}
				jAlert(message, 'Error');
			},
			complete : function() {
				$("body").removeClass("loading");
			}
		});
	},
	'showInformation' : function() {
		var information = arguments[0];
		showInformationIntoView(information);
	}
};

function jAlert(output_msg, title_msg)
{
    if (!title_msg)
        title_msg = 'Alert';

    if (!output_msg)
        output_msg = 'Sin informaci&oacute;n.';

    $("<div title="+title_msg+"></div>").html(output_msg).dialog({
        resizable: false,
        width: "auto",
        modal: true,
        buttons: {
            "Cerrar": function() 
            {
                $( this ).dialog( "close" );
            }
        }
    });
}