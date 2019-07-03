package entidades;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioLiquido() {
		return salarioBruto-imposto;
	}
	public void aumentoSalario(double percentagem) {
		salarioBruto+=salarioBruto*percentagem/100;
	}
	
	public String toString() {
		return nome + " , $ " + String.format("%.2f", salarioLiquido());
	}

}