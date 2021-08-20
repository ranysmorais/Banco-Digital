package Classes;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" --- EXTRADO CONTA CORRENTE --- ");	
		super.printInfoExtract();
		System.out.println("-- -- --- --- --- --- ---  -- -");
	}	

}
