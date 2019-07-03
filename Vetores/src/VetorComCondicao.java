import java.util.Scanner;

public class VetorComCondicao {

	public static void main(String[] args) {



		 Scanner scan = new Scanner(System.in);
		 
		
		 int [] vetorA= new int[10];
		 int [] vetorB= new int [vetorA.length];
		 int [] vetorC=new int [vetorA.length];
		 
		 
		 for(int i=0; i<vetorA.length; i++) {
	 System.out.println("Entre com valor do Vetor A da posiçao " + i);
	 vetorA[i]=scan.nextInt();
		 }
		 for(int i=0; i<vetorA.length; i++) {
			 System.out.println("Entre com valor do Vetor B da posiçao " + i);
			 vetorB[i]=scan.nextInt();
	
	  
	 if(vetorA[i]>vetorB[i]) {
		 vetorC[i]=1;
	 } else if( vetorA[i]==vetorB[i]) {
		 vetorC[i]=0;
	 } else {
		 vetorC[i]=-1;
	 }

	}
		 System.out.println("Valores do vetor A : ");
        for(int i=0; i<vetorA.length; i++) {
   System.out.print(vetorA[i] + " ");
  
        }
        System.out.println();
        System.out.println("Valores do vetor B : ");
        for(int i=0; i<vetorA.length; i++) {
   System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.println("Valores do vetor C : ");
        for(int i=0; i<vetorA.length; i++) {
   System.out.print(vetorC[i] + " ");
 
        }

}
}