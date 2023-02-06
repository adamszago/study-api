package com.estudo.estudoapi.notificacao;

import org.springframework.stereotype.Component;

import com.estudo.estudoapi.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através telefone %s: , %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
