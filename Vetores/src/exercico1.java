import java.util.Scanner;

public class exercico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);	
		
		int [] vetorA = new int [5];
		int [] vetorB = new int [vetorA.length];
		
		
     for( int i=0; i<vetorA.length; i++) {
    	 System.out.println("Entre com o valor da posui��o " + i);
    	 vetorA[i]=scan.nextInt();
    	 vetorB[i]=vetorA[i];
     }
       System.out.println(" Vetor A : ");
       for (int i=0; i<vetorA.length; i++) {
    	   System.out.println("Posi��o " + i + " : " + vetorA[i]);
       }
       System.out.println();
       System.out.println();
       System.out.println("Vaetor B : ");
       for ( int i=0; i<vetorB.length; i ++) {
    	   System.out.println("Posi��o " + i + " � : " + vetorB[i]);
       }
	}

}
