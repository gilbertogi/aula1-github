package com.vetor;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Qual tabuada deseja ver: ");
		int num=scan.nextInt();
		
   System.out.println("Tabuada " + num + " :");
		for(int i=1; i<=10; i++) {
			System.out.println(num + " x " + i + " = " +(num*i));
		}
		
	}

}
