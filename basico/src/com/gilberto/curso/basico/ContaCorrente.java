package com.gilberto.curso.basico;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double saldo;
	double valorEspecialUsado;
	double limiteEspecial;

	boolean realizarSaque(double quantiaSacar) {
		if (saldo >= quantiaSacar) {
			saldo -= quantiaSacar;
			return true;
			
		}else if(especial) {
		
			double limite=limiteEspecial+saldo;
			if(limite>=quantiaSacar) {
				saldo -= quantiaSacar;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
			
		}
 
		}

void depositar(double valorDepositado) {
	saldo+=valorDepositado;
}
void consultarSaldo() {
	System.out.println(" O saldo da conta= " + saldo);
}
}



