package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.ConversaoMoeda;



public class Programa5 {

	public static void main(String[] args) {
		
		
	
		// Conversao de Moeda
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Qual � o pre�o de Dollar?");
		double precoDollar=sc.nextDouble();
		System.out.println("Quantas notas pretende comprar?");
		double montante=sc.nextDouble();
	   double resultado=ConversaoMoeda.dollarParaReal(montante, precoDollar);
	   
	   System.out.printf("O Valor a ser pago em reais = %.2f%n" , resultado );

	}

}
