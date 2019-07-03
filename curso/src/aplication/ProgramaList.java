package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaList {

	public static void main(String[] args) {


	  List <String> list = new ArrayList <> ();
	  
	  list.add("Maria");
	  list.add("Alex");
	  list.add("Bob");
	  list.add("Ana");
	  list.add(2, "Marco");
	  
	  System.out.println(list.size());
	  for(String x: list) {
		  System.out.println(x); 
	  }
	  System.out.println("-----------------------");
	  list.removeIf(x-> x.charAt(0)=='M');
	  for(String x: list) {
		  System.out.println(x); 
	  }
	  System.out.println("----------------");
	  System.out.println("Encontre a posi��o com index of " + list.indexOf("Bob"));
	  System.out.println("Encontre a posi��o com index of " + list.indexOf("Alex"));
	  System.out.println("-----------------");
	  //Filtrar os nomes que come�am com A
	  List<String> resultado = list.stream().filter(x-> x.charAt(0)=='A').collect(Collectors.toList());
	  
	  for(String x: resultado) {
		  System.out.println(x);
	  }
	  System.out.println("-----------------");
	  // encontrar o primeiro elemento que o nome come�a com A, se n�o encontrar retorne null
	  String nome=list.stream().filter(x-> x.charAt(0)=='A').findFirst().orElse(null);
	  System.out.println(nome);
	}

}