import java.util.Scanner;

public class VetorSoma {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
		
		int [] vetorA= new int [10];
		
		int soma=0;
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor do Indice: " +i);
			vetorA[i]=scan.nextInt();
			soma+=vetorA[i];
	
	}
		System.out.println("A soma de Vetores �: " + soma);
	}
}