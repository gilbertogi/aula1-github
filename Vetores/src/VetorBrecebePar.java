import java.util.Scanner;

public class VetorBrecebePar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		
		 int [] vetorA= new int[10];
		 int [] vetorB=new int  [vetorA.length];
		 
		 int posB=0;
		 for(int i=0; i<vetorA.length; i++) {
	 System.out.println("Entre com valor do Vetor A da posiçao " + i);
	 vetorA[i]=scan.nextInt();
	 
		 }
		 for(int i=0; i<vetorA.length; i++) { 
		  if(vetorA[i] % 2==0) {
			  vetorB[posB]=vetorA[i];
			  posB++;	
		}
	}
		 
		  for(int i=0; i<vetorA.length; i++) { 
			  if(vetorA[i] % 2 !=0) {
				  vetorB[posB]=vetorA[i];
				  posB++;	
	}
}
		  System.out.println("Valor vetor A: ");
		  for(int i=0; i<vetorA.length; i++) { 
			  System.out.print(vetorA[i] + " ");
		  }
		  System.out.println();
		  System.out.println("Valor vetor B: ");
		  for(int i=0; i<vetorA.length; i++) { 
			  System.out.print(vetorB[i] + " ");
		  
}
		  System.out.println();
		  System.out.print(posB + " ");
}
}