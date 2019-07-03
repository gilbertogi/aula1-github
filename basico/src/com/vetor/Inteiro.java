package com.vetor;

import java.util.Scanner;

public class Inteiro {

	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Entre com 1º numero");
	int num1=scan.nextInt();
	System.out.println("Entre com 2º numero");
	int num2=scan.nextInt();
	
    if(num1<num2) {
    	for(int i=num1; i<num2; i++) {
    		System.out.println(i);
    	}
        }  
    else { for(int i=num2; i<=num1; i++) {
    	
    	System.out.println(i);	
    	}
		
		
	}
	
	}

}
