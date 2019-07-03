package aplication;

import java.util.Scanner;

import entidades.Aluguel;

public class ProgramaAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel []vetor= new Aluguel[10];
		
		System.out.print("Quanto quartos alugado?");
		int n=sc.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.println();
			System.out.println("Aluguel#" + i + ":");
			System.out.print("Nome:");
			sc.nextLine();
			String nome=sc.nextLine();
			System.out.println("Email: ");
			String email=sc.nextLine();
			System.out.println("Quarto:");
			int quarto=sc.nextInt();
			vetor[quarto]= new Aluguel (nome, email);
		}
		System.out.println();
		System.out.println("Quarto ocupados: ");
		for(int i=0; i<10; i++) {
	if(vetor[i]!=null) {
		System.out.println(i + " : " + vetor[i]);
	}
		}
	}

}
