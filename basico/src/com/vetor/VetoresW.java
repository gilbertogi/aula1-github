package com.vetor;

import java.util.Scanner;



public class VetoresW {
	
	public static void main (String [] args) {
		
      
		
		
		
		Scanner scan = new Scanner (System.in);
      
    
      String nome="";
      int idade=0;
      double salario=0;
      String sexo="";
      String estadoCivil="";
 	  
 	  boolean valida =false;
  
 	  while(valida==false) {
 		  System.out.println("Entre com o nome de usuario");
 		  nome=scan.next();
 		  
 		  if(nome.length()>3) {
 			  valida=true;
 		  }else {
 			  System.out.println("O nome deve ter mais de 3 caractres, digite novamente");
 		  }
 	  }
 	 valida =false;
 	  while(valida==false) {
 		  
 		 System.out.println("Entre com a idade");
		  idade=scan.nextInt();
		  
		  if(idade>=0 && idade<=150) {
			  valida=true;
		  }else {
			  System.out.println("Idade deve estar entre 0 a 150, digite novamente");
		  }
	  }
 	 valida =false;
 	 while(valida==false) {
		  
 		 System.out.println("Entre com o salario");
		  salario=scan.nextDouble();
		  
		  if(salario>0) {
			  valida=true;
		  }else {
			  System.out.println("O salario deve ser difrente de 0, digite novamente");
		  }
	  }
 	 valida =false;
 	 while(valida==false) {
		  
 		 System.out.println("Entre com sexo");
		  sexo=scan.next();
		  
		  if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
			  valida=true;
		  }else {
			  System.out.println("Sexo deve M ou F, digite novamente");
		  }
	  }
 	 valida =false;
 	 while(valida==false) {
		  
 		 System.out.println("Entre com Estado Civil");
		  estadoCivil=scan.next();
		  
		  if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
			  valida=true;
		  }else {
			  System.out.println("Estado civil s,c,d,v. digite novamente");
		  }
		
	  }
 	  System.out.println(nome);
 	  System.out.println(idade);
 	  System.out.println(salario);
 	  System.out.println(sexo);
 	  System.out.println(estadoCivil);
	}
}
	




    
	