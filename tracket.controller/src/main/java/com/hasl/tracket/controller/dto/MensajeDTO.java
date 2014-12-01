package com.hasl.tracket.controller.dto;

public class MensajeDTO   {

	private String message;
	
	private Boolean correct;
	
	public MensajeDTO(String message, Boolean correct) {
		this.setMessage(message);
		this.setCorrect(correct);
	}

	public Boolean getCorrect() {
		return correct;
	}

	public void setCorrect(Boolean correct) {
		this.correct = correct;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
