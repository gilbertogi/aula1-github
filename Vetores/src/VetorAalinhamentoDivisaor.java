
import java.util.Scanner;
public class VetorAalinhamentoDivisaor {

	public static void main(String[] args) {

  Scanner scan = new Scanner (System.in);
	    int[] vetorA = new int[8];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posi��o A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        for (int i=0; i<vetorA.length; i++) {
        	
        	System.out.println("Dividores do n�mero " + vetorA[i]);
        	for(int j=1; j<vetorA[i]; j ++) {
        		if(vetorA[i]%j==0) {
        			System.out.println(j + " � divisor");
        		}	
        	}
        	System.out.println();
        }
        
	}
}