package Interfaces;

import Classes.Conta;

public interface IContas {
	
	void sacar(double valor);
	
	void depositar(double valor);	

	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
	
}