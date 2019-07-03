import java.util.Scanner;

public class VetorAimparBeC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		
		 int [] vetorA= new int[10];
		 int [] vetorB=new int  [10];
		 int [] vetorC= new int [10];
		 
		 
		 for(int i=0; i<vetorA.length; i++) {
	 System.out.println("Entre com valor do Vetor A da posiçao " + i);
	 vetorA[i]=scan.nextInt();
		 }
		 
		 int postB=0;
		 int postC=0;
		 for(int i=0; i<vetorA.length; i++) {
			
			 if(vetorA[i]%2==0) {
				 vetorB[postB]=vetorA[i];
				 postB++;
			 } else {
				 vetorC[postC]=vetorA[i];
				 postC++;
				 
			 }
		}
		
		     System.out.println();
		   System.out.println("Imprima vetor A : ");
		 for(int i=0; i<vetorA.length; i++) {
			 System.out.print(vetorA[i] + " ");
		 }
		   System.out.println();
		   System.out.println("Imprima vetor B : ");
		 for(int i=0; i<postB; i++) {
			 System.out.print(vetorB[i] + " ");
		 }
		 System.out.println();
		   System.out.println("Imprima vetor C : ");
		 for(int i=0; i<postC; i++) {
			 System.out.print(vetorC[i] + " ");
		 }
	}

}
