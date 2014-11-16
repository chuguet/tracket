package com.hasl.tracket.model.repository;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.hasl.tracket.model.config.SpringModelConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringModelConfiguration.class, loader = AnnotationConfigContextLoader.class)
public abstract class AbstractTest {

}
