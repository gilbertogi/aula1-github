package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class ProgramaConta {

	public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      Conta conta;
      
      System.out.print("Entre com numero da conta: ");
      int numero=sc.nextInt();
      System.out.print("Entre com o Titular: ");
      sc.nextLine();
      String titular=sc.nextLine();
      System.out.println("Tem deposito Inicial (s/n)? ");
      char resposta=sc.next().charAt(0);
      if(resposta=='s') {
    	  System.out.println("Entre com o valor de deposito Inicial");
    	  double depositoInicial=sc.nextDouble();
    	  conta= new Conta(numero, titular, depositoInicial);
      }
      
      else {
    	  conta= new Conta(numero, titular);
      }
      
      System.out.println();
      System.out.println("Dados da Conta :");
      System.out.println(conta);
      
      System.out.println();
      System.out.print("Entre com o valor de deposito :");
      double valorDeposito=sc.nextDouble();
      conta.deposito(valorDeposito);
     
      System.out.println("Dados atualizados :");
      System.out.println(conta);
      
      System.out.print("Entre com valor a Sacar:");
      double valorSacar=sc.nextDouble();
      conta.sacar(valorSacar);
      
      System.out.println("Dados atualizados :");
      System.out.println(conta);
      
      
      
     sc.close();
	}

}
