package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class Programa3 {

	public static void main(String[] args) {

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     Empregado empregado = new Empregado();
     
     System.out.print("Nome: ");
     empregado.nome=sc.nextLine();
     System.out.print("Salario Bruto: ");
     empregado.salarioBruto=sc.nextDouble();
     System.out.print("Imposto: ");
     empregado.imposto=sc.nextDouble();
     
     System.out.println();
     System.out.println("Empregado : " + empregado);
     System.out.println();
     
     System.out.print("Percentagem de aumento de salario: " );
     double percentagem=sc.nextDouble();
     empregado.aumentoSalario(percentagem);
     
     System.out.println();
     System.out.println("Dados atualizados: " + empregado);
     
     sc.close();

	}

}
