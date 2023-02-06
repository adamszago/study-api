package com.estudo.estudoapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.estudo.estudoapi.modelo.Cliente;
import com.estudo.estudoapi.service.AtivacaoClienteService;

@Controller
public class PrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	
	public PrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente c = new Cliente("Adams", "adams@gmail.com", "34 9 9693 8922");
		ativacaoClienteService.ativar(c);
		return "hello World";
	}
}
