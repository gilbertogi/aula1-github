

import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {

     Scanner scan = new Scanner (System.in);
     
     int n;
     
     
     System.out.println("Entre com o valor ");
     n=scan.nextInt();
     int fatorial=1;
     for(int i=n; i>0; i--) {
    	 fatorial*=i;
    	 System.out.println(i);
    	 
     }
     System.out.println(fatorial);
		
	}

}
