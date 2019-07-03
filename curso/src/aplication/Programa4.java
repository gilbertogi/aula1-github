package aplication;
import java.util.Locale;
import java.util.Scanner;

import entidades.Calculador;

public class Programa4 {


  public static void main(String[] args) {

	    Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Entre com o raio:");
		double raio=sc.nextDouble();
		
		
		double c= Calculador.circumferenca(raio);
		double v= Calculador.volume(raio);
		
		System.out.printf("Cirecumferença : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculador.PI);

		sc.close();
	}
}


