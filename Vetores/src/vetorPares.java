import java.util.Scanner;

public class vetorPares {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		int [] vetorA= new int [5];
		//int [] valorPares= new int[5];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor do Indice: " +i);
			vetorA[i]=scan.nextInt();
			
		}
	

		 int qtdPares=0;
		 int valorPares=0;
		   System.out.print("Os valores do vetorA: ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			       if(vetorA[i]%2==0)	{
			    	   valorPares=vetorA[i];
			    	    qtdPares++;
			    	   
			}
		}
			       System.out.println();
			if(qtdPares==0) {
				System.out.println("Não existe nenhum numero Par");
			} else {
				System.out.print("ValoresPares:" );
				//for(int valorpar: valorPares) {
					System.out.print(valorPares);
			//	}
				System.out.println();
				System.out.print("Quantidades: " + qtdPares + " ");
			}
		}
	
	}
	