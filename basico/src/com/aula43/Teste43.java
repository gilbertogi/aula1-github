package com.aula43;

public class Teste43 {

	public static void main(String[] args) {
	
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ci�ncia da Computa��o");
		
		double [] notas = {10,19,8,7};
		aluno.setNotas(notas);
    	 
    	 System.out.println(aluno);
    	 
    		Aluno aluno2 = new Aluno();
    		
    		aluno2.setCurso("Ci�ncia da Computa��o");
    		double [] notas2 = {10,19,8,7};
    		aluno.setNotas(notas2);
    		
      System.out.println(aluno.equals(aluno2));
     }
     
		
	}
