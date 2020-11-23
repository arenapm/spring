package com.spring.IoC;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
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

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Tareas de secretario";		
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Secretario: " + informeNuevo.getInforme();
	}

}
