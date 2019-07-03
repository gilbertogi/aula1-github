package com.gilberto.curso.basico;

public class Carro4 {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	

}



/*
	public Carro4() {
		
	}

	
	
	public Carro4(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com tres parametro");
	}

	public Carro4(String marca, String modelo) {
		this(marca, modelo, 4);
		System.out.println("Chamando construtor com dois parametro");
	}

	void exibirAutonomia() {
		System.out.println("Autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	public double obterAutonomia() {
	
		System.out.println("Metodo obter a autonomia foi chamado");
      return capCombustivel*consumoCombustivel;
	}
	
  private double divdeKMPorConsumoCombustivel(double km) {
	  return km/this.consumoCombustivel;
  }

  public double calcularCombustivel(double km) {
	 
	  return divdeKMPorConsumoCombustivel(km);*/
	  