package com.vetor;

import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
	
		
Scanner scan = new Scanner(System.in);
		
		//System.out.println("Entre com o numero");
		//String resultado="resultado";
		String continuar="continuar";
		double media=0;
		double soma=0;
		double qt=0;
		
	
		
		
	do {
		System.out.println("Entre com idade");	
		int num=scan.nextInt();
		qt++;
		soma+=num;
		System.out.println("Deseja continuar? s/n ");
		continuar=scan.next();
		
	}while(continuar.equals("s"));

	media=soma/qt;
	System.out.println("A quantidade �: " + qt);
	System.out.println("A soma �: " + soma);
	System.out.println("A media � : " + media);
	
	if(media>=0 && media<=25 ) {
		System.out.println(" A turma � jovem");
	}else if( media>=26 && media <=60) {
		System.out.println(" A turma � adulta");
	}else {
		System.out.println("A turma � idosa");
	}
	}

}
