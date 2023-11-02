package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dtx.Config;
import org.springframework.dtx.ServiceImpl;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		ServiceImpl serviceImpl = (ServiceImpl) context.getBean("serviceImpl");

		serviceImpl.query();
	}
}