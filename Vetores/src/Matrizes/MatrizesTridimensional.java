package Matrizes;

public class MatrizesTridimensional {

	public static void main(String[] args) {


  int [][][]matriztridimensional= new int [3][3] [3];
  
  for (int i=0; i<matriztridimensional.length; i++) {
	  for (int j=0; j<matriztridimensional[i].length; j++) {
		  for (int k=0; k<matriztridimensional[i][j].length; k++) {
System.out.println("i= " + i + " - j = " + j + " - k = " + k );
			  matriztridimensional[i][j][k]=i+j+k;
		  }
	  }
  }
  int soma=0;
  int somaPares=0;
  int somaImpares=0;
  for (int i=0; i<matriztridimensional.length; i++) {
	  for (int j=0; j<matriztridimensional[i].length; j++) {
		  for (int k=0; k<matriztridimensional[i][j].length; k++) {
			
			  soma+= matriztridimensional[i][j][k];
			 
			  if( matriztridimensional[i][j][k]%2==0) {
				  somaPares+= matriztridimensional[i][j][k];  
			  } else {
				  somaImpares+= matriztridimensional[i][j][k];
			  }
		  }
	}
}
  System.out.println("A soma total : " + soma);
  System.out.println("A soma Impares : " + somaPares);
  System.out.println("A soma Impares : " + somaImpares);
  
}
}