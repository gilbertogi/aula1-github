package com.gilberto.curso.basico;

public class Lampada {

	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoBajur;
	private boolean ligada;

	
	
	public Lampada() {
	
	}

	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses,
			String[] tipos, boolean tipoBajur, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoBajur = tipoBajur;
		this.ligada = ligada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public boolean isTipoBajur() {
		return tipoBajur;
	}

	public void setTipoBajur(boolean tipoBajur) {
		this.tipoBajur = tipoBajur;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {
		setLigada(true);
	}

	public void desligar() {
		setLigada(false);
	}

	public void mostarEstatdo() {
		if (isLigada()) {
			System.out.println("A lampda esta ligada");
		} else {
			System.out.println(" A lampada esta desliga");
		}
	}
	public void mudarEstado() {
		if(isLigada()) {
			desligar();	
	}else {
		ligar();
	}
	}

}