
public class Vet15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
 double [] temperatura = new double [366]; // tamanho ou posi��es
 
   temperatura[0]=31.3; // acessara a temperatura/ inicializar o array;
   temperatura[1]=32;
   temperatura[2]=33;
   temperatura[3]=34;
   temperatura[4]=35;
   temperatura[5]=36.6;
   
   System.out.println("O valor da temperatura do dia 1 �:" + temperatura[4]);
   System.out.println("Tamanho de array: " + temperatura.length ); // saber o tamanho

   // saber os valores no array, pode ser whilw ou for
   // O for usase qdo ja se sabe o loop
   for (int i=0; i<temperatura.length; i++) { // forma padrao p/ imprimir ou interar array
	   System.out.println(" O valor da temperatura do dia" + (i+1) + " � " + temperatura[i]);
   }
   // for melhorando tbm p/ imprir array
   System.out.println();
   for (double temp: temperatura) {
	   System.out.println(temp);
	   
	   // A diferen�a entre for normal e melhorando, o normal temos mais detalhe atraves do i, consiguimos saber os numeros de vezes q ele passa , ao passo no melhorando apenas imprimimos
   }
	}

}
