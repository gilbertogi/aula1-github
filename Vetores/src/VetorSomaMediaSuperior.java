
import java.util.Scanner;
public class VetorSomaMediaSuperior {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		int [] vetorA= new int[10];
		
		for( int i=0; i<vetorA.length; i++) {
		System.out.println("Entre com o valor da posi��o " + i);
		vetorA[i]=scan.nextInt();
		
	}
		int soma=0;
		int igual15=0;
		int superior15=0;
		int qtd=0;
		
		for(int i=0; i<vetorA.length; i++ ) {
			if(vetorA[i]<15) {
				soma+=vetorA[i];
			}
			else if(vetorA[i]==15) {
				igual15++;
			}
			
			else {
				superior15+=vetorA[i];
				qtd++;
				
			}
		}
	for(int vetor: vetorA)	{
		System.out.print(vetor + " ");
	}
	
	System.out.println();
	System.out.println("Soma de vetor inferior a 15: " + soma);
	System.out.println("Quantidada de elemento do vetor igual a 15:  "  + igual15);
	System.out.println("Media dos elementos de vetor superior a 15: " + superior15/qtd);
	
         
}
}