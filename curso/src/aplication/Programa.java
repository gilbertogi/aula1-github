package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {

        // TRIANGULO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Triangulo x, y;
		x= new Triangulo();
		y= new Triangulo();
		
       System.out.println("Entre com os valores de X");
       x.a=sc.nextDouble();
       x.b=sc.nextDouble();
       x.c=sc.nextDouble();
       System.out.println("Entre com os valores de X");
       y.a=sc.nextDouble();
       y.b=sc.nextDouble();
       y.c=sc.nextDouble();
       
       
       double areax= x.area();
       double areay= y.area();
        
       
       
       
       System.out.printf("Triangulo da area X: %.4f%n", areax);
       System.out.printf("Triangulo da area Y: %.4f%n", areay);
       
       if(areax>areay) {
    	   System.out.println("X é a maior area");
       } else {
    	   System.out.println("Y é maior area");
       }
       sc.close();
	}

}
