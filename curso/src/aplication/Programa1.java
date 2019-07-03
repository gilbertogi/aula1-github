package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa1 {

	public static void main(String[] args) {
		
		//PRODUTO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//Produto produto = new Produto();
		System.out.println("Entre com dados do Produto: ");
		System.out.print("Nome: ");
		String nome=sc.nextLine();
		System.out.print("Preco: ");
		double preco=sc.nextDouble();
		
		
		Produto produto = new Produto(nome, preco);
		
		System.out.println();
		System.out.println("Dados de Produtos : " +produto);
		
		System.out.print("Entre com o produto para addicionar nos Estoque: ");
        int quantidade=sc.nextInt();
        produto.adicionarProduto(quantidade);
        
        System.out.println();
		System.out.println("Dados atualizados : " +produto);
		
		System.out.print("Entre com o produto para serem removidos no Estoque: ");
        quantidade=sc.nextInt();
        produto.removerProduto(quantidade);
        
        System.out.println();
		System.out.println("Dados atualizados : " +produto);
		
		sc.close();
	}

}
