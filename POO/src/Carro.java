
public class Carro {
	String marca;
	String nome;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	
	void exibirAutonomia() {
		System.out.println("Atonomia é :" + capCombustivel*consumoCombustivel);
	}
	
	double obterAutonomia() {
		
	System.out.println("O metodo Obter Autonomia foi chamado");
		return capCombustivel*consumoCombustivel;
	}
	double consumoCombustivel(double km) {
		double qtdCombustivel =km/consumoCombustivel;
		return qtdCombustivel ;
	}
	
}
