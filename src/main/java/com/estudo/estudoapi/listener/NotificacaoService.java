package com.estudo.estudoapi.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.estudo.estudoapi.notificacao.NivelUrgencia;
import com.estudo.estudoapi.notificacao.Notificador;
import com.estudo.estudoapi.notificacao.TipoDoNotificador;
import com.estudo.estudoapi.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired 
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro está ativo");
	}
}
