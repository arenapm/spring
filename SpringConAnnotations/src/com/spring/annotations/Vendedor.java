package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*@Scope("prototype")*/
public class Vendedor implements Empleados {
	
	@PostConstruct
	public void ejecutarAntes() {
		System.out.println("Ejecuci�n antes del bean");
	}
	
	@PreDestroy
	public void ejecutarDespues() {
		System.out.println("Ejecuci�n despues del bean");
	}
	
	@Autowired
	@Qualifier("informeFinanciero3")
	private CreacionInformeFinanciero nuevoInforme;
		
//	public Vendedor() {
//		
//	}
//	
//	@Autowired
//	public Vendedor(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
//	
//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}


	@Override
	public String getTareas() {
		return "Vender, vender y vender m�s";
	}

	@Override
	public String getInforme() {
		return nuevoInforme.getInformeFinanciero();
	}

}
