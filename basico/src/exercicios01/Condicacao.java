package exercicios01;

import java.util.Locale;
import java.util.Scanner;

public class Condicacao {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);

	Scanner scan = new Scanner(System.in);
	
	double preco=0;
	
	System.out.println("Entre com o tipo de carne");
	System.out.println("1 - File Dduplo");
	System.out.println("2 - Alcatra");
	System.out.println("3 - Picanha");
	int tipo=scan.nextInt();
	
	System.out.println("Entre com a quantidade de carne");
	double qtd=scan.nextDouble();
	
	
	if(tipo==1) {
		if(qtd<=5) {
			preco=4.9;
	  } else {
		  preco=5.8;
	  }
	}
		
	if(tipo==2) {
			if(qtd<=5) {
				preco=5.9;
		  } else {
			  preco=6.8;
		  }
		}
			
	if(tipo==3) {
				if(qtd<=5) {
					preco=6.9;
			  } else {
				  preco=5.8;
			  }
			}
				
				
		   double precoTotal=preco*qtd;
		   double valorPagar=0;
		   double desconto=0;
			String tipoPagamento="";
			System.out.println("Tipo de pagamento: Cartão Tabaja? Cartao / Cash");
			tipoPagamento=scan.next();
			if(tipoPagamento.equalsIgnoreCase("Cartao")) {
				
				desconto= (precoTotal/100)*5;
				valorPagar=precoTotal-desconto;
			}else if (tipoPagamento.equalsIgnoreCase("Cash")) {
				valorPagar=precoTotal;
			}
			
			System.out.println("Tipo de quantidade de Carne: " + tipo);
			System.out.println("Quantidade de Carne: " + qtd);
			System.out.println("Precço: " + preco);
			System.out.println("Preço Total: " + precoTotal);
			System.out.println("Tipo de pagamento: " + tipoPagamento);
			System.out.println(" Valor de desconto: " + desconto);
			System.out.println("Valor a pagar: " + valorPagar);
		}
	}
	
	
	