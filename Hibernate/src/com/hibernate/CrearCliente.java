package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrearCliente {

	public static void main(String[] args) {
		
		Clientes cliente1 = new Clientes("Ivan", "Boroski");
		
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Clientes.class)
				.buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
						
			miSession.beginTransaction();		
			miSession.save(cliente1);			
			miSession.getTransaction().commit();						
			System.out.println("Cliente grabado en base de datos");
			
			miSession.beginTransaction();			
			System.out.println("Lectura del registro con id: " + cliente1.getId());
			Clientes clienteInsertado = miSession.get(Clientes.class, cliente1.getId());
			System.out.println("Registro: " + clienteInsertado);
			miSession.getTransaction().commit();
			System.out.println("Terminado!");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			miSession.close();
			
		}
	}
	
}
