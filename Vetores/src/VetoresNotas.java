
import java.util.Scanner;

public class VetoresNotas {

	public static void main(String[] args) {

   Scanner scan= new Scanner (System.in);
   
   double [] notas1= new double [10];
   double [] notas2= new double [10];
   double [] resultados= new double [10];
   
		
   for(int i=0; i<notas1.length; i++) {
	   System.out.println("Entre com a nota 1 do aluno " + (i+1));
	   notas1[i]=scan.nextDouble();
	   System.out.println("Entre com a nota 1 do aluno " + (i+1));
	   notas2[i]=scan.nextDouble();
	   
	   resultados[i]=notas1[i]+notas2[i]/2;
	   
   }
   System.out.println("Notas 1 = ");
      for(int i=0; i<notas1.length; i++) {
    	  System.out.println(notas1[i] + " ");
      }
      System.out.println();
      System.out.println("Notas 2 = ");
      for(int i=0; i<notas1.length; i++) {
    	  System.out.println(notas2[i] + " ");
      }
      System.out.println();
      System.out.println("Resultados= ");
      for(int i=0; i<notas1.length; i++) {
    	  
    	  if(resultados[i]>=7) {
    		  System.out.println(resultados[i]+ " Aprovado ");
    	  } else {
    		  System.out.println(resultados[i]+ " Reprovado ");
    	  }
   
	}

}



}	
	   	