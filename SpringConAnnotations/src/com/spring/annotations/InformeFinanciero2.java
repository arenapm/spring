package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentaci�n de informe periodo 3";
	}

}