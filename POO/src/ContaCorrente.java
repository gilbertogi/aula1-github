
public class ContaCorrente {
	
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;

	
	
	boolean realizarSaque(double quantiaSacar) {
		// se tiver dinheiro na conta
	if(this.saldo>=quantiaSacar) {
		saldo-=quantiaSacar;
		return true;
	} else if(especial) {// se n�o tem nada na conta
	// verificar se o limite � especial	
		double limite = limiteEspecial+saldo;
		if(limite>=quantiaSacar) {
			saldo-=quantiaSacar;
			return true;
		}
	}else {
		return false;
		
	} 
	return false;
	   // N�o tem dinheiro suficinte
	}
      void depositar(double valorDepositado) {
    	  
    	 saldo+=valorDepositado;
      }
      
      void consultarSaldo() {
    	  System.out.println("O saldo actual da conta � : " + saldo);
      }
      
      boolean verificarUsoChequEspecial() {
    	 return saldo<0; // se o saldo for inferior q 0 � verdadeiro
      }
		
	}
