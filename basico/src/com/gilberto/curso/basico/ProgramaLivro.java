package com.gilberto.curso.basico;

import java.util.Date;

public class ProgramaLivro {

	public static void main(String[] args) {
	
		
		Livros livro= new Livros();
		livro.nome="Cybervops";
		livro.autor="Gilberto";
		livro.anoLancamento=2019;
		
		livro.emprestado=true;
		livro.dataEntrega=new Date();
		livro.emprestadoA="Maloco";
		
		System.out.println();

	}

}
