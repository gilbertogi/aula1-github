package com.gilberto.curso.basico;

import java.util.Locale;
import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
       
		System.out.println("Entre com o slario");
		double salario = entrada.nextDouble();
		double salarioAumento = 0;
		int percentagem;
		double valorAumento;
		if (salario <= 280) {
			salarioAumento = (1.2) * salario;
			percentagem=20;
			valorAumento=salarioAumento-salario;
		} else if (salario > 280 && salario <= 700) {
			salarioAumento = (1.15) * salario;
			percentagem=15;
			valorAumento=salarioAumento-salario;
		}else if(salario>700 && salario<=1500) {
			salarioAumento=(1.1)*salario;
			percentagem=10;
			valorAumento=salarioAumento-salario;
		}else {
			salarioAumento=(1.05)*salario;
			percentagem=5;
			valorAumento=salarioAumento-salario;
		}
		System.out.println("Salario antes de reajuste é: " + salario);
		System.out.println("A percentagem é : " + percentagem);
		System.out.println("O valor de aumentos é :" + valorAumento);
		System.out.println("O novo salario é :" + salarioAumento);
		
	}
}