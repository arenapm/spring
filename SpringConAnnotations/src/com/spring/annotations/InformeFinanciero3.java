package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentaci�n de informe periodo 1";
	}

}