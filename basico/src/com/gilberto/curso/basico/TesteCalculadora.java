package com.gilberto.curso.basico;

public class TesteCalculadora {

	public static void main(String[] args) {

      Calculadora calc = new Calculadora();
      
      int i= calc.soma(1, 2);
      int a=calc.soma(1, 2,1);
      System.out.println(i);
      System.out.println(a);
      
	}

}
