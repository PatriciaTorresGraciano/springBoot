package com.habilidades.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesMentalidades {

	@GetMapping
	public String habilidade() {
		return "Mentalidade - Persistência e Habilidade - Atenção aos detalhes";
	}
}
