package Matrizes;

public class Matrizes {

	public static void main(String[] args) {


		double [] [] notasAlunos= new double [3][4];
		notasAlunos [0][0]=1;
		notasAlunos [0][1]=11;
		notasAlunos [0][2]=14;
		notasAlunos [0][3]=16;
		
		notasAlunos [1][0]=10;
		notasAlunos [1][1]=0;
		notasAlunos [1][2]=0;
		notasAlunos [1][3]=10;
		
		notasAlunos [2][0]=10;
		notasAlunos [2][1]=15;
		notasAlunos [2][2]=14;
		notasAlunos [2][3]=1;
		
		for( int i=0; i<notasAlunos.length; i++) {
			
			for( int j=0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Calculando a m�dia");
		
		double soma;
		for ( int i=0; i<notasAlunos.length; i++) {
			soma=0;
			for(int j=0; j<notasAlunos[i].length; j++) {
				soma+=notasAlunos[i][j];
			}
			System.out.println(" M�dia de " + i + " � " + soma/4);
		}
		
		System.out.println();
		System.out.println();
		
		
		
		double [] [] notasAlunos2= {{12,4,5,17},{8,9,7,3}};
		System.out.println("Notas Alunos 2");
	
		for(int i=0; i<notasAlunos2.length; i++) {
			
			for(int j=0; j<notasAlunos2[i].length; j++) {
				System.out.print(notasAlunos2[i][j] +   "  ");
			}
			System.out.println();
		}
	

}
}