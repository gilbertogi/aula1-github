package com.vetor;

import java.util.Scanner;

public class MediaTurma {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com numeros de turmas");
		int numTurmas=scan.nextInt();
		
		int numAlunos = 0;
		int soma=0;
		boolean invalido=true;
		
		for(int i=1; i<=numTurmas; i++) {
			invalido= true;
		do {	System.out.println("Entre com o numero de alunos da turma" + i);
			numAlunos=scan.nextInt();
			if(numAlunos<=40) {
				invalido=false;
			}else {
				System.out.println("N�mero de Aluno invalido, digite novamente");
			}
		}while (invalido);
		soma+=numAlunos;
	}

	double media=soma / numTurmas;
    System.out.println(media);

	}

}