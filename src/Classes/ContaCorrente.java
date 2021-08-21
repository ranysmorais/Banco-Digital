package Classes;

public class ContaCorrente extends Conta{	
	
	public ContaCorrente(Pessoa cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println(" --- EXTRADO CONTA CORRENTE --- ");	
		super.printInfoExtract();		
		System.out.println("-- -- --- --- --- --- ---  -- -");
	}

	@Override
	public void imprimirDadosConta() {
		
		System.out.println(" --- DADOS CONTA PUPANCA --- ");
		super.printInfoConta();
		System.out.println("-- -- --- --- --- --- ---  -- -");
		
	}	

}
