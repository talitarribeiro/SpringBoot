package br.org.generation.habilidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidade")
public class HabilidadeController {
	
	@GetMapping
	public String habilidadeShow() {
		return "Para realizar esta atividade foi necessário persistência, atenção aos detalhes e por último, mas não menos importante, mentalidade de crescimento.";
		
	}	

}
