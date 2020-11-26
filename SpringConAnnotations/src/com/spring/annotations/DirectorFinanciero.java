package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Tareas del Director Financiero";
	}

	@Override
	public String getInforme() {
		return informeFinanciero.getInformeFinanciero();
	}

}
