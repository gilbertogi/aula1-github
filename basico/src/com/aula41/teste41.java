package com.aula41;


public class teste41 {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa ();
		Pessoa aluno = new Aluno ();
		Pessoa professor = new Professor();
		
		//pessoa.setEnderenco("Rua 1 , num 1");
		aluno.setEnderenco("Rua 2 , num 2");
		professor.setEnderenco("Rua 3 , num 3");
		
	//System.out.println(pessoa.obterEtiquetaEndereco());
	//System.out.println(aluno.obterEtiquetaEndereco());
	//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}
