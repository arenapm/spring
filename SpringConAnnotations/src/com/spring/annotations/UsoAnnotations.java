package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados sergio = contexto.getBean("vendedor", Empleados.class);
		
		System.out.println(sergio.getTareas());
		System.out.println(sergio.getInforme());
		
		contexto.close();
	}

}
