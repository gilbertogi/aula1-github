package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ArrayListFuncionario;

public class ProgramaArralistFuncionario {

	public static void main(String[] args) {

     Locale.setDefault(Locale.US);
     
     Scanner sc = new Scanner (System.in);
     
     List<ArrayListFuncionario>list = new ArrayList<>();
		
      // PARTE 1 : Lendo dados
     System.out.println("Quanto funcionario serão registados");
     int n=sc.nextInt();
     
     for(int i=0; i<n; i++) {
    	 System.out.println();
    	 System.out.println("Funcionario#" + i + ":");
    	 System.out.print("Id:");
    	 int id=sc.nextInt();
    	 System.out.print("Nome:");
    	 sc.nextLine();
    	 String nome=sc.nextLine();
    	 System.out.print("Salario: ");
    	 double salario=sc.nextDouble();
    	 list.add(new ArrayListFuncionario(id, nome, salario));
     }
     // PARTE 2 : Atualizar salario dado pelo funcionario
     System.out.println();
     System.out.println("Entre com id de Funcionario que pretenda aumentar o salario");
	int id=sc.nextInt();
	ArrayListFuncionario emp=list.stream().filter(x-> x.getId()==id).findFirst().orElse(null);
	if(emp==null) {
		System.out.println("Este Id não existe");
	} else {
		 System.out.println("Entre com a percentagem");
		 double percentagem=sc.nextDouble();
		 emp.aumentoSalrio(percentagem);
	}
	
	// PARTE 3 - Listar Funcionario
	
	System.out.println();
	System.out.println("Lista dos Funcionario:");
	for(ArrayListFuncionario obj : list) {
		System.out.println(obj);
	}
	sc.close();
	}

}
