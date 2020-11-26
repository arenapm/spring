package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.annotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	@Bean
	public CreacionInformeFinanciero informeCompras(){
		return new InformeCompras();
	}
	
	@Bean
	public Empleados directorFinanciero(){
		return new DirectorFinanciero(informeCompras());
	}

}
