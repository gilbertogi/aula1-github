package com.aula40;

public class Aluno extends Pessoa{
	
	
	private String curso;
	
	private double [] notas;
	
	


	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Aluno(String nome, String enderenco, String telefone, String curso) {
		super(nome, enderenco, telefone);
		this.curso=curso;
	
	}


	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
  public double calcularMedia() {
	  return 0;
  }
  public boolean verificarAprovado() {
	  return true;
  }
  
  public String obterEtiquetaEndereco() {
	   
	  String s="Endere�o do Aluno:";
	  s+= this.getEnderenco();
	  return s;
	  }
}

