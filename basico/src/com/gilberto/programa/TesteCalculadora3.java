package com.gilberto.programa;

import java.util.Scanner;

public class TesteCalculadora3 {

	public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	
	int num;
	do {
		System.out.println("Entre com numero posetivo");
		num=entrada.nextInt();
		if(num<0) {
			System.out.println("Numero invalido, entre novamente");
		}
	}while(num<0);
	System.out.println(Calculador3.fatorial(num));
	
	
	System.out.println("-------------------------");
	
		imprimirTela(Calculador3.somar(3,3));
		imprimirTela(Calculador3.subtrair(3,2));
		imprimirTela(Calculador3.multiplicar(2,2));
		imprimirTela(Calculador3.dividir(6,2));
		imprimirTela(Calculador3.potencia(2,3));
		
		
	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	

}
}
