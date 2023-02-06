package com.estudo.estudoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.estudo.estudoapi.modelo.Cliente;


@Component
public class AtivacaoClienteService {

	//@Autowired (required = false) Exemplo de injeção opcional
	/*
	 * @TipoDoNotificador(NivelUrgencia.URGENTE)
	 * 
	 * @Autowired private Notificador notificador;
	 */
	
	//Padrao Observer
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	/*
	 * Exemplo de ponto de injeção no construtor (É o ideal)
	 * @Autowired public AtivacaoClienteService(Notificador notificador) {
	 * this.notificador = notificador; }
	 */

	public void ativar(Cliente cliente) {
		cliente.ativar();
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		//notificador.notificar(cliente, "Seu cadastro foi ativado!");
	}

	/*
	 * Exemplo de ponto de injeção no Set
	 * @Autowired public void setNotificador(Notificador notificador) {
	 * this.notificador = notificador; }
	 */
	
	
}
