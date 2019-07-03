package com.gilberto.curso.basico;

public class Carro3 {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	
	public Carro3(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro3() {
		
	}

	
	
	public Carro3(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com tres parametro");
	}

	public Carro3(String marca, String modelo) {
		this(marca, modelo, 4);
		System.out.println("Chamando construtor com dois parametro");
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
