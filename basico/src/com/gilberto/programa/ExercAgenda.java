package com.gilberto.programa;

import java.util.Scanner;

public class ExercAgenda {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com o nome da agenda");
    String nome = scan.nextLine();
    
    Agenda agenda = new Agenda(nome);

    ContatoAgenda[] contatos= new ContatoAgenda[3];
    for(int i=0; i<3; i++) {
    	System.out.println("Entre com as informaçoes do contato" +(i+1));
    	
    	ContatoAgenda c= new ContatoAgenda();
    	
    	System.out.println("Entre com o nome");
    	nome= scan.nextLine();
    	c.setNome(nome);
    	
    	System.out.println("Entre com o telefone");
    	String telefone= scan.nextLine();
    	c.setTelefone(telefone);
    	
    	System.out.println("Entre com o Email");
    	String email= scan.nextLine();
    	c.setEmail(email);
    	
    	contatos[i]=c;
    	
    }
    agenda.setContatos(contatos);
    if(agenda!=null) {
    System.out.println(agenda.obterInfo());
	}
 
	}
}