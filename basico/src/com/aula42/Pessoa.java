package com.aula42;

public final class Pessoa {
	
	private String nome;
	private String enderenco;
	private String telefone;
	private String cpf;
	
	private String telefoneCeluna;
	
	
	public Pessoa() {}
	public Pessoa(String nome, String enderenco, String telefone) {
		super();
		this.nome = nome;
		this.enderenco = enderenco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderenco() {
		return enderenco;
	}
	public void setEnderenco(String enderenco) {
		this.enderenco = enderenco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneCeluna() {
		return telefoneCeluna;
	}
	public void setTelefoneCeluna(String telefoneCeluna) {
		this.telefoneCeluna = telefoneCeluna;
	}
	
  //public abstract String obterEtiquetaEndereco() ;
 // public abstract void imprimirEtiquetaEndereco() ;
	   
	  
}
