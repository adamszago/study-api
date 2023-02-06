package com.estudo.estudoapi.notificacao;

import com.estudo.estudoapi.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}