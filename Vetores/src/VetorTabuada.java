import java.util.Scanner;

public class VetorTabuada {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		int [] vetorA= new int [5];
		
    for(int i =0; i<vetorA.length; i++) {
	System.out.println("Entre com a valor da posi��o " + i);
		vetorA[i]=scan.nextInt();

	}
    for(int i =0; i<vetorA.length; i++) {
  System.out.println(vetorA[i] +" x "+ vetorA[i] + " = " + vetorA[i]*vetorA[i]);
    	
}
}
}