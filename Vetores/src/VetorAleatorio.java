

import java.util.Scanner;
public class VetorAleatorio {

	public static void main(String[] args) {

// Aleatorio e percentagem, qunatidade etc
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA= new int [10];
		int qtd0=0;
		int qtd1=0;
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i]=(int)Math.round(Math.random()* 1);
			
			if(vetorA[i]==0){
				qtd0++;
				
			} else {
				qtd1++;
			}
			
		}
		// 10  -100%
		// qtd -x
		// x= (qtd*100)/100;
		
		double porc0=(qtd0*100)/vetorA.length;
		double porc1=(qtd1*100)/vetorA.length;
	
		System.out.println("Imprimir vetor A");
	      for(int vetora: vetorA) {
		System.out.print(vetora + " ");
	}
	      System.out.println();
	      System.out.println("Porcentagem 0 " + porc0);
	      System.out.println("Porcentagem 1 " + porc1);
	}

}
