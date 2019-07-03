import java.util.Scanner;

public class VetorPar {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		 // veridicar se for impar caso for use o break para parar o loop
		 int [] vetorA= new int[10];
		 
	for(int i=0; i<vetorA.length; i++) {
		System.out.println("Entre com numero para a posição " + i);
		vetorA[i]=scan.nextInt();
		
		if(vetorA[i]%2 !=0) {
			break;
		}
	}

	}

}
