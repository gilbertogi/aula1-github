package com.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan= new Scanner(System.in);
		
		double media=0;
		double soma=0;
	   int q=0;
		int num=0;
		for(int i=0; i<=4; i++) {
			System.out.println(" entre com o numero");
			num=scan.nextInt();
			
			 q=num;
			soma+=num;
			media=soma/q;
			System.out.println("A quantidade é " + q);
			System.out.println("A media é " + media);
			System.out.println("A soma é " + soma);
		}
		
	}
	

}
