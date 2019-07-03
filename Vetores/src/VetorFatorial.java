import java.util.Scanner;

public class VetorFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner (System.in);
	     
	     int [] vetorA = new int [5];
	     int [] vetorB = new int [vetorA.length];
	     
	     
	    
	     for(int i=0; i<vetorA.length; i++) {
	    	 System.out.println("Entre com o vetor da posição " + i);
	    	 vetorA[i]=scan.nextInt(); 
	     }

	     for(int i=0; i<vetorA.length; i++) {
	    	 
	    	vetorB[i]=1;
	    		 for(int j=1; j<=vetorA[i]; j++) {
	    			 vetorB[i]*=j;
	    		 }
	    	 }
	     System.out.println("Vetor A :");
	     for(int i=0; i<vetorA.length; i++) {
	    	 System.out.print(vetorA[i] + " ");
	     }
	     System.out.println("Vetor A :");
	     for(int i=0; i<vetorA.length; i++) {
	    	 System.out.print(vetorB[i] + " ");
	     }
	   
	     }
}
	
			
		

	
