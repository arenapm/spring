package com.spring.annotations;

public class InformeCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe de Compras";
	}

}
