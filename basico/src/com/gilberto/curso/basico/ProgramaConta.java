package com.gilberto.curso.basico;

public class ProgramaConta {

	public static void main(String[] args) {
	
	ContaCorrente conta= new ContaCorrente();
	
	conta.numero="2383838383";
	conta.agencia="2344";
	conta.especial=true;
	conta.limiteEspecial=500;
	conta.saldo=-20;
	
	System.out.println("Saldo da conta " + conta.numero + " = " +conta.saldo);
	
     boolean saqueEfetuado=conta.realizarSaque(500);
     if (saqueEfetuado) {
    	 System.out.println("Saque efetuado com sucesso");
    	 System.out.println("o Saldo atual da conta = " + conta.saldo);
     }else {
    	 System.out.println("Não foi possivel realizar saque, saldo insuficiente");
     }
	
	 System.out.println("Valor depositado" );
	  conta.depositar(500);
	 System.out.println("Saldo actual = " +conta.saldo);
}
}


