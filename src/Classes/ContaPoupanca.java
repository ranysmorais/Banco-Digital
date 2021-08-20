package Classes;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println(" --- EXTRADO CONTA PUPANCA --- ");
		super.printInfoExtract();
		System.out.println("-- -- --- --- --- --- ---  -- -");
	}	
	
}
