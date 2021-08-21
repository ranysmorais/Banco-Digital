package Main;
import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;
import Classes.PessoaFisica;
import Classes.PessoaJuridica;

public class Main {

	public static void main(String[] args) {		
		
		// criando Cliente Pessoa Fisica
		PessoaFisica clientePF = new PessoaFisica();		 
		clientePF.setNome("José Henrique");
		clientePF.setEmail("jose@email.com");
		clientePF.setTelefone("6299999-9999");
		clientePF.setCpf("111.222.333-44");		
			 
		// criando Cliente Pessoa Juridica
		PessoaJuridica clientePJ = new PessoaJuridica();		 
		clientePJ.setNome("Interlagos Sorveteria");
		clientePJ.setEmail("interlagosSovert@email.com");
		clientePJ.setTelefone("6298888-8888");
		clientePJ.setCNPJ("XX. XXX. XXX/0001-XX"); 		 
		
		// criando Conta Poupança
		Conta cp = new ContaPoupanca(clientePJ);
		// criando Conta Corrente
		Conta cc = new ContaCorrente(clientePF);
		//fim
		
		/*  
		 * Depositando valor a conta
		 */		
		//conta corrente
		cc.depositar(200);
		//conta poupança
		cp.depositar(1000); 
		System.out.println("# DEPOSITAR VALOR\n");
		cp.imprimirExtrato();
		cc.imprimirExtrato();
		System.out.println("\n");
		//fim depositar
		
		/*
		 * Transferindo valor para outra conta.
		 */		
		// de conta corrente para poupança
		cc.transferir(50, cp, clientePJ);
		// de conta poupança para corrente
		cp.transferir(25.50, cc, clientePF);
		System.out.println("# TRANSFERIR VALOR\n");
		cp.imprimirExtrato();
		cc.imprimirExtrato();
		System.out.println("\n");
		//fim transferir
		
		/*
		 * Sacando valor disponivel
		 */		
		// conta corrente
		cc.sacar(50);
		// conta poupança
		cp.sacar(500);
		System.out.println("# SACAR VALOR\n");
		cp.imprimirExtrato();
		cc.imprimirExtrato();
		System.out.println("\n");
		// fim sacar		
			
		System.out.println("---------------------------------");
		System.out.println(" --- IMPRIMIR DADOS DA CONTA --- \n");		
		cp.imprimirDadosConta();
		cc.imprimirDadosConta();
	}
}
