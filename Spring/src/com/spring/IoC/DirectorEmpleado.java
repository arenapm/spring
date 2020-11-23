package com.spring.IoC;

public class DirectorEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	// M�todo Init
	
	public void metodoInicial() {
		System.out.println("M�todo Init - Tareas a ejecutar antes de que el bean est� listo");
	}
	
	// M�todo Destroy
	
	public void metodoFinal() {
		System.out.println("M�todo Destroy - Tareas a ejecutar despu�s de utilizar el bean");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {		
		return "Tareas de director";		
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
