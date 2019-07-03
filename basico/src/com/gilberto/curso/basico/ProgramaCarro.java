package com.gilberto.curso.basico;

public class ProgramaCarro {

	public static void main(String[] args) {
		
		
		Carro van = new Carro();
		
		van.marca="Fiat";
		van.modelo="Ducato";
		van.numPassageiros=10;
		van.capCombustivel=100;
		van.consumoCombustivel=0.2;
		
		van.exibirAutonomia();
		van.obterAutonomia();
		double autonomia= van.obterAutonomia();
		
		System.out.println("Autonomia do Carro é " + autonomia);
		System.out.println("Autonomia do Carro é " + van.obterAutonomia());
		
        double qtCombustivel10=van.calcularCombustivel(10);
        double qtCombustivel15=van.calcularCombustivel(15);
        System.out.println("qtCombustivel10= " + qtCombustivel10);
        System.out.println("qtCombustivel15= " + qtCombustivel15);
	}

}
