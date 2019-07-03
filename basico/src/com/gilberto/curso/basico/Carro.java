package com.gilberto.curso.basico;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	void exibirAutonomia() {
		System.out.println("Autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
	
		System.out.println("Metodo obter a autonomia foi chamado");
      return capCombustivel*consumoCombustivel;
	}
  double calcularCombustivel(double km) {
	 
	 double qtCombustivel=km/consumoCombustivel;
	  return qtCombustivel;
	  
  }
	
}
