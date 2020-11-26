package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación de informe periodo 1";
	}

}