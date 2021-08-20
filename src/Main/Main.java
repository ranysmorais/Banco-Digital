package Main;
import Classes.Cliente;
import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;


public class Main {

	public static void main(String[] args) {
		
		Cliente ranys = new Cliente();		
		ranys.setNome("Ranys Morais");
		
		Cliente rafaela = new Cliente();				
		rafaela.setNome("Rafaela Nunes");		
		
		Conta cp = new ContaPoupanca(ranys);				
		
		Conta cc = new ContaCorrente(rafaela);		
			
		cp.depositar(20);
		cc.depositar(1000);
		
		cc.transferir(500, cp);
		
		cp.imprimirExtrato();
		cc.imprimirExtrato();
	}
}
