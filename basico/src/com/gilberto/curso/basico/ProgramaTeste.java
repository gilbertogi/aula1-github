package com.gilberto.curso.basico;

import java.util.Scanner;

public class ProgramaTeste {

	public static void main(String[] args) {
		
	Scanner entrada= new Scanner(System.in);
	Aluno aluno= new Aluno();
	System.out.println("Entre com o nome do Aluno");
	aluno.nome=entrada.nextLine();
	System.out.println("Entre com o nome do curso");
	aluno.nomeCurso=entrada.next();
	System.out.println("Entre com a matricula");
	aluno.matricula=entrada.next();
	
	for ( int i=0; i<aluno.nomeDisciplinas.length; i++) {
		System.out.println("Entre com o nome da displinas");
		aluno.nomeDisciplinas[i]=entrada.next();
	}
	for (int i=0; i<aluno.notasDisciplinas.length; i++) {
		System.out.println("Obtendo notas das disciplinas " + aluno.nomeDisciplinas[i]);
	for (int j=0; j<aluno.notasDisciplinas[i].length; j++) {
		System.out.println(" entre com a nota " + (j+i));
		aluno.notasDisciplinas[i][j]=entrada.nextDouble();
	}
	
	}
	aluno.mostrarInfo();
	}

	

}
