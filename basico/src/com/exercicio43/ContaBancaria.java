package com.exercicio43;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNometCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String cliente) {
		nomeCliente = cliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		
		String s= "";
		s+="nomeCliente: "  + nomeCliente;
		s+=" ;numConta: "  + numConta;
		s+=" ;saldo: "  + saldo;
		return s;
	}
	public void depositar(double valor) {
		saldo+=valor;
		
	}
	public boolean sacar(double valor) {
		if((saldo-valor)>=0) {
			saldo-= valor;	
			return true;
		}
		return false;
	}
}
