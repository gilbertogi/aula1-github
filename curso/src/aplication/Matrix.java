package aplication;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de linhas");
		int linhasM=sc.nextInt();
		System.out.println("Numero de Colunas");
		int colunasN=sc.nextInt();
		
		int [][] mat= new int [linhasM][colunasN];
		
		for(int i=0; i<mat.length; i++) {
			System.out.println("Entre com valor da posição : " + i);
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("Entre com valor");
		int x=sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				
				if(mat[i][j]==x) {
					System.out.println("Posição" + i + "," + j + " :");
				
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}