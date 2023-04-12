package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
	return "<b>Hello turma 62! </B>";
	}
	
	@GetMapping("/bsm")
	public String listaBsm(){
		return "<b>Metalidade de Crescimento <br/> Persistência<b></br>Responsabilidade Pessoal<br/>Orientação ao Detalhe";
		
	}
	@GetMapping("/objetivos")
	public String objetivosAprendizagem() {
		return "<b>Orientação ao Detalhe</b>";
			
	}
	
	}

