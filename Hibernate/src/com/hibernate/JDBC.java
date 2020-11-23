package com.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hibernate?serverTimezone=GMT-3";
		String user = "root";
        String password = "";
        
        try {
			
        	System.out.println("Intentando conectar con la base de datos " + url);
        	
        	Connection miConexion = DriverManager.getConnection(url, user, password);
        	
        	System.out.println("Coneción exitosa!!!");
        	
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
        
	}   

}
