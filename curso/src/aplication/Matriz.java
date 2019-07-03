package aplication;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		int n= sc.nextInt();
		int [][] matematica= new int [n][n];
		
		for( int i=0; i<n; i++) {
			System.out.println("Entre com o i da posição" + i);
			for(int j=0; j<n; j++) {
				matematica[i][j]=sc.nextInt();
			}
		}
		 System.out.println("Imprima diagonal principal");
		for(int i=0; i<n; i++) {
			System.out.print(matematica[i][i]);
		}
		System.out.println();
		System.out.println("Percorre os  numeros negativos");
		int contar=0;
		for( int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			 if(matematica[i][j]<0) {
				 contar++;
			 }	
	   }
	}
		System.out.println("Os numeros negativos da Matriz: " + contar);
}
}


