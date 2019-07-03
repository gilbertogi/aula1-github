import java.util.Scanner;

public class Vetores {
	
	public static void main (String [] argas) {
		
	   Scanner scan= new Scanner (System.in);	
		
	   int [] vetorA = new int [3];
	   int [] vetorB = new int [8];
	   int soma=0;
	   int mult=1;
	   double media =0;
	   
		for (int i=0; i<vetorA.length; i++) {
	
System.out.println("Entre com o valor da posição: " + i);
		vetorA[i]=scan.nextInt();
		soma=soma+vetorA[i];
		mult=mult*vetorA[i];
		
		
	   
	}
		
		media=soma/vetorA.length;
		System.out.println("a soma é " + soma);
		System.out.println(" A multiplicao é " + mult);
		System.out.println(" A multiplicao é " + media);

}
	
	
}