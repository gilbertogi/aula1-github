package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa2 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com largura e altura");
		retangulo.largura=sc.nextDouble();
		retangulo.altura=sc.nextDouble();
		
		System.out.printf("Area = %.2f%n ",  + retangulo.area());
		System.out.printf("Perimetro = %.2f%n ",  + retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n ",  + retangulo.diagonal());
	}

}
