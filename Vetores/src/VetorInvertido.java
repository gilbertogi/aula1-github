import java.util.Scanner;

public class VetorInvertido {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		
		 int [] vetorA= new int[10];
		 int [] vetorB=new int  [vetorA.length];
		 
		 
		 for(int i=0; i<vetorA.length; i++) {
	 System.out.println("Entre com valor do Vetor A da posi�ao " + i);
	 vetorA[i]=scan.nextInt();
	 
	 vetorB[vetorA.length-i-1]=vetorA[i];
		 }
		
		     System.out.println();
		   System.out.println("Imprima vetor A : ");
		 for(int i=0; i<vetorA.length; i++) {
			 System.out.print(vetorA[i] + " ");
		 }
		   System.out.println();
		   System.out.println("Imprima vetor B : ");
		 for(int i=0; i<vetorA.length; i++) {
			 System.out.print(vetorB[i] + " ");
		 }
	}

}