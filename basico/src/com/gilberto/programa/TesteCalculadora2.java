package com.gilberto.programa;

import com.gilberto.curso.basico.Calculadora;

public class TesteCalculadora2 {
	static int resultSoma;

	public static void main(String[] args) {
		
		resultSoma=  Calculadora2.soma(1,2);
		
		Calculadora2 calc = new Calculadora2();
	      
	     //calc.soma(1,2);
		System.out.println(resultSoma);
	    
		}

	}


	