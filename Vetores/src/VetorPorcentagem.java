
import java.util.Scanner;

public class VetorPorcentagem {
  // Calcular a porcentagem de Impar e Par
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int [] vetorA= new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i]=scan.nextInt();
		}
		int impar=0;
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 !=0) { // atencao ao = qdo usamos !
				impar++;
			}
		}
		int par= vetorA.length-impar;
		
		//formula para calcular a porcentagem:
		//vetorA.lenth --100   Faça cruzamento 
		// par      -----x    ; x vai representar impar e par sepradamente
		//logo:
		double porcPar=(par*100)/vetorA.length;
		double porcImpar=100-porcPar;
		
		System.out.println("A porcentagem de Par é : " + porcPar);
		System.out.println("A porcentagem de Impar é :" + porcImpar);
	}

}
