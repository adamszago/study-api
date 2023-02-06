package com.estudo.estudoapi.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.estudo.estudoapi.modelo.Cliente;

@Profile("development")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Seria Notificado %s através do e-mail %s: , %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
