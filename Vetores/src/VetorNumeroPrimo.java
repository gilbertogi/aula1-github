import java.util.Scanner;

public class VetorNumeroPrimo {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		int [] vetorA= new int [5];
		
		 
		
    for(int i =0; i<vetorA.length; i++) {
	System.out.println("Entre com a valor da posi��o " + i);
		vetorA[i]=scan.nextInt();
	}
    
    boolean primo;
    String msg="";
  
   for( int i=0; i<vetorA.length; i++) {
	   
	   primo=true;
	   for(int j=2; j<vetorA[i]; j++) {
		   if(vetorA[i] % j == 0) {
			   primo=false;
			   break; // break foi usado para pular
		   }
	   }
	  
	   msg="";
	   if(primo) {
		   msg=" � primo";
	   } else {
		   msg=" N�o � primo";
	   }
	   System.out.println(vetorA[i] + msg);
   }

	}
}
