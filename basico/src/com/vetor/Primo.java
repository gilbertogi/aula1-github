package com.vetor;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero");
		int num=scan.nextInt();
		
		boolean valido=true;;
		
		for(int i=2; i<num; i++) {
			if(num% i==0) {
				System.out.println("O " + num + " Não é primo, divisil por " + i);
				valido=false;
			} 
		}
			if(valido) {
			System.out.println("O " + num + " é primo");
			//valido=true;
		}
		}
}

