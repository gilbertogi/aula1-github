
public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.nome="Kia";
		van.modelo="KiaPicante";
		van.numPassageiro=10;
		van.capCombustivel=100;
		van.consumoCombustivel=0.2;
		
		System.out.println(van.nome);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		
		System.out.println(van.obterAutonomia());
		double qtdCombustivel=van.consumoCombustivel(10);
		System.out.println(qtdCombustivel);

	}

}
