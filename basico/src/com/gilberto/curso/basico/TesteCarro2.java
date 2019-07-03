package com.gilberto.curso.basico;

public class TesteCarro2 {

	public static void main(String[] args) {
		
		Carro2 van = new Carro2();
		van.marca="Fiat";
		van.modelo="Ducato";
		van.numPassageiros=10;
		van.capCombustivel=100;
		van.consumoCombustivel=0.2;	
		
		System.out.println(van.numPassageiros);
		
		System.out.println(":::::::::::::::::::::::::::::");
		
		Carro2 van1 = new Carro2("Kia Optima", "Toyota", 10, 10.20, 2.2);
		//van1.marca="Fiat";
		//van1.modelo="Ducato";

		System.out.println("A marca do carrro: " + van1.marca);
		System.out.println("O modelo: " + van1.modelo);
		System.out.println("Número de passageiros:" + van1.numPassageiros);
		System.out.println("Capacidade de combustivel: " + van1.capCombustivel);
		System.out.println("Capacidade de Consumo: " + van1.consumoCombustivel);
	

	}

}
