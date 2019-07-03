package com.vetor;

import java.util.Scanner;

public class Vetor22 {

	public static void main(String[] args) {
	

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com 1º numero");
		int num1=scan.nextInt();
		System.out.println("Entre com 2º numero");
		int num2=scan.nextInt();
		int soma =0;
	    if(num1<num2) {
	    	for(int i=num1; i<num2; i++) {
	    		System.out.println(i);
	    		soma+=i;
	    		System.out.println("A soma é :" + soma);
	    	}
	        }  
	    else { for(int i=num2; i<=num1; i++) {
	    	
	    	System.out.println(i);	
	    	soma+=i;
	    	System.out.println("A soma é :" + soma);
	    	}
			
			
		}
		
	}

}
