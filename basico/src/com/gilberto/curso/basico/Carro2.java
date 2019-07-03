package com.gilberto.curso.basico;

public class Carro2 {
	
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	Carro2(){
		numPassageiros=10;
		System.out.println("Carro foi instaciada");
	}
	Carro2(String marca, String modelo, int numPass, double capComb, double consumoC ){
		this.marca = marca;
		this.modelo=modelo;
		this.numPassageiros=numPass;
		this.capCombustivel=capComb;
		this.consumoCombustivel=consumoC;
	}
	
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

	

