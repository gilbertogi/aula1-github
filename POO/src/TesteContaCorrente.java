
public class TesteContaCorrente {

	public static void main(String[] args) {


	ContaCorrente conta = new ContaCorrente();
	
	conta.numero="1111111";
	conta.agencia="Rua da India";
	conta.especial=true;
	conta.limiteEspecial=500;
	conta.valorEspecialUsado=0;
	conta.saldo=-10;

	System.out.println(" Saldo da conta " + conta.numero + " = " + conta.saldo);
	
	boolean saqueEfetuado= conta.realizarSaque(10);
	
	if(saqueEfetuado) {
	   System.out.println("Saque efetuado com sucesso");
	   conta.consultarSaldo();
	} else {
		System.out.println("N�o foi  possivel realizar saque. Saldo � insuficiente");
	} 
	
	System.out.println("Tentativa de saque ");
    saqueEfetuado= conta.realizarSaque(500);
	
	if(saqueEfetuado) {
	   System.out.println("Saque efetuado com sucesso");
	   conta.consultarSaldo();
	} else {
		System.out.println("N�o foi  possivel realizar saque. Saldo � insuficiente");
	} 
	System.out.println(" Deposito de 500 reais");
	conta.depositar(500);
	//System.out.println(conta.depositar(500));
	conta.consultarSaldo();
	 // VERIFICAR SE ESTA USAR CHEQUE ESPECIAL
	if(conta.verificarUsoChequEspecial()) {
		System.out.println("Esta usar cheque Especial");
	} else {
		System.out.println("N�o esta usar cheque especial");
	}
	conta.realizarSaque(600);
	  conta.consultarSaldo();
	System.out.println();
	 // VERIFICAR SE ESTA USAR CHEQUE ESPECIAL
		if(conta.verificarUsoChequEspecial()) {
			System.out.println("Esta usar cheque Especial");
		} else {
			System.out.println("N�o esta usar cheque especial");
		}
	}
}

	
	
	
