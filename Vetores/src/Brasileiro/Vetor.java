package Brasileiro;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner (System.in);
		
        System.out.println("Entre com o numero :");
        int n=sc.nextInt();
        double [] vet= new double  [n];
        
        for(int i=0; i<n; i++) {
        	System.out.println("Entre com Altura da posi��o : " + i);
        	vet[i]=sc.nextDouble();
        }
       double soma=0;
       for(int i=0; i<n; i++) {
            	soma+=vet[i];
       }
       
       System.out.printf("A media da altura � %.2f%n", + soma/vet.length);
        	sc.close();
        }
	}

