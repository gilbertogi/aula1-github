import java.text.DecimalFormat;
import java.util.Scanner;

public class exercio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    int [] vetorA = new int [6];
		int [] vetorB = new int[vetorA.length]; // vetorB vai ser um double por causa de raiz quadrado
		
		
	 for( int i=0; i<vetorA.length; i++) {
		 System.out.println("Entre com o valor da posui��o " + i);
		 vetorA[i]=scan.nextInt();
		 vetorB[i]=vetorA[i]* i; // recebe vetorA q multiplica pela posi��o
	 }
	 
	   System.out.print(" Vetor A : ");
	   for (int i=0; i<vetorA.length; i++) {
		   System.out.print(vetorA[i] + " ");
	   }
	   System.out.println();
	   System.out.print("Vetor B : ");
	   for ( int i=0; i<vetorB.length; i ++) {
		   System.out.print(vetorB[i]+ " ");
	   }



		}

	
}