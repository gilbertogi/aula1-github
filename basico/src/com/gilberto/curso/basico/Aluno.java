package com.gilberto.curso.basico;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String [] nomeDisciplinas=new String [3];
	double [] [] notasDisciplinas=new double [3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: " +nome);
		System.out.println("Matricula: " +matricula);
		System.out.println("Nome do curso: " +nomeCurso);
	
	
	for (int i=0; i<notasDisciplinas.length; i++) {
		System.out.println("Notas das disciplinas" +nomeDisciplinas[i]);
		for(int j=0; j<notasDisciplinas[i].length; j++) {
			System.out.print(notasDisciplinas[i][j] + "");
		}
		System.out.println();
	}
	
}
	
	}