package com.primer.pagina.pagina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication
@ComponentScan(basePackages = {"com.primer.pagina.pagina", "com.primer.pagina.controller","com.primer.pagina.configuracion"})

public class PrimerPaginaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimerPaginaApplication.class, args);
	}

}
