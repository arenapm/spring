package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {

		// Configuración desde archivo .xml
		// ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Configuración desde archivo .class
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		Empleados antonio = contexto.getBean("vendedor", Empleados.class);
		Empleados lucia = contexto.getBean("vendedor", Empleados.class);
		
		System.out.println(antonio);
		System.out.println(lucia);
		
		
		Empleados mauro = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(mauro.getTareas());
		System.out.println(mauro.getInforme());
		
		
		DirectorFinanciero ricardo = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println(ricardo.getEmail());
		System.out.println(ricardo.getNombreEmpresa());
		
		contexto.close();
	}

}
