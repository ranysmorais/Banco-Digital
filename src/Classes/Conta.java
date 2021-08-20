package Classes;
import Interfaces.IContas;

public abstract class Conta implements IContas{
	
	private static final int AGENCIA_PADRAO = 2045;
	private static int SEQUENCIAL = 5500;
	
	protected int agencia;
	protected int numConta;
	protected Double saldo = 0.00;
	protected Cliente cliente;
	

	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
		
	@Override
	public void sacar(double value) {
		this.saldo -= value;
	}

	@Override
	public void depositar(double value) {
		this.saldo += value;
	}

	@Override	
	public void transferir(double value, Conta contaDestino) {
		if(value > saldo) { value = 0; }
		this.sacar(value);
		contaDestino.depositar(value);
	}	
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	protected void printInfoExtract() {
		System.out.println(String.format("Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("Conta: %d",this.numConta));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
	}
	
}
