package br.org.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivosShow() {
		return "Nesta semana, o objetivo é focar no desenvolvimento do Blog Pessoal.";
		
	}	

}
