package com.vetor;

import java.util.Scanner;

public class CD {

	public static void main(String[] args) {
	
		
		Scanner scan= new Scanner (System.in);
		
		double preco;
		double soma=0;
		int cds;
		System.out.println("Entre com numeros de cds");
		cds=scan.nextInt();
		
		for(int i=1; i<=cds; i++) {
			
			System.out.println("Informe o valor de cds" + i);
			preco=scan.nextDouble();
			soma+=preco;
		}
		
		double media=soma/cds;
		System.out.println("Media gasta com cada CD: " + media);
		
	}

}
