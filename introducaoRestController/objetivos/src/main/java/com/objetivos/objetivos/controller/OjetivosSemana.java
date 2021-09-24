package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class OjetivosSemana {

	@GetMapping
	public String objetivosSemana() {
		return "Aprender Spring Boot";
	}

}
