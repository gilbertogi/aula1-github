package com.vetor;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
      
		Scanner scan = new Scanner(System.in);
		
		  int num=0;
          int par=0;
		  int impar=0;
		
		
		
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Entre com num ");
			num=scan.nextInt();
			if(num % 2==0) {
				par++;
		}else {
			impar++;
		}
		}
	
		System.out.println("A quantidade de par :" + par);
		System.out.println("A quantidade de impar :" + impar);
	}

}

