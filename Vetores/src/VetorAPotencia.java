import java.util.Scanner;

public class VetorAPotencia {

	public static void main(String[] args) {


		  Scanner scan = new Scanner (System.in);
		    double [] vetorA = new double[5];
		    double [] vetorB = new double[vetorA.length];
	        
	        for (int i=0; i<vetorA.length; i++){
	            
	            System.out.println("Entre com o valor da posi��o A - " + i);
	            vetorA[i] = scan.nextDouble();
	        }
	        
	        for( int i=0; i<vetorA.length; i++) {
	        	vetorB[i]=Math.pow(2, vetorA[i]);
	        	System.out.println(vetorB[i]);
	        }
	     
		}
	}