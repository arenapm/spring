package com.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados{

	public static void main(String[] args) {
		
//		Empleados empleado1 = new DirectorEmpleado();
//		
//		System.out.println(empleado1.getTareas());

				
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
//		
//		System.out.println(juan.getTareas());
//		
//		System.out.println(juan.getInforme());
		
		
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(maria.getTareas());
		
		System.out.println(maria.getInforme());
		
		System.out.println("Email: " + maria.getEmail());
		
		System.out.println(maria.getNombreEmpresa());
		
		
		SecretarioEmpleado pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println("Email de Pablo: " + pablo.getEmail());
		
		
		DirectorEmpleado walter = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(walter.getTareas());
		
		System.out.println(walter.getInforme());
		
		System.out.println("Email: " + walter.getEmail());
		
		System.out.println(walter.getNombreEmpresa());
		
		
		contexto.close();

	}

}
