package Classes;


public class ContaPoupanca extends Conta{	
	
	public ContaPoupanca(Pessoa cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		
		System.out.println(" --- EXTRADO CONTA PUPANÇA --- ");
		super.printInfoExtract();
		System.out.println("-- -- --- --- --- --- ---  -- -");
	}

	@Override
	public void imprimirDadosConta() {
		
		System.out.println(" --- DADOS CONTA PUPANÇA --- ");
		super.printInfoConta();
		System.out.println("-- -- --- --- --- --- ---  -- -");
		
	}
	
}
