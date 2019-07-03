package com.vetor;

import java.util.Locale;
import java.util.Scanner;



public class Vetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan= new Scanner(System.in);
		
  int num;
  int maior= Integer.MIN_VALUE;
   
   for( int i=0; i<=5; i++) {
	   
	 System.out.println("Entre com um numero");
	 num=scan.nextInt();
	 
	 if(num>maior) {
		 maior=num;
	 }
   }
		System.out.println("Maior é " + maior);
	
}
}