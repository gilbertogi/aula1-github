package com.exercicio43;

public class TesteExercio43 {

	public static void main(String[] args) {

    System.out.println("******Teste Conta Bancaria******");
    
	ContaBancaria contaSimples = new ContaBancaria();
	contaSimples.setNomeCliente("Cliente Conta Simples");
	contaSimples.setNumConta("111111");
	
	contaSimples.depositar(100);
	
	if(contaSimples.sacar(50)) {
		System.out.println("Salddo efetuado com sucesso, novo saldo é : " + contaSimples.getSaldo());
	} else {
		System.out.println(" Saldo insuficiente para saque de " + 50 + "; saldo de =" + contaSimples.getSaldo());
	}
	contaSimples.sacar(70);
	

}
}