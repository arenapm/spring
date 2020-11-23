package com.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getInforme());
		
		contexto.close();

	}

}
