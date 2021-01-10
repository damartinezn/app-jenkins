package com.clearminds.deberes.entidades;

public class Telefono {
	private String operadora;
	private String numero;

	public void imprimir(){
		System.out.println("Operadora : " +this.operadora + " Numero : "+this.numero);
	}
	
	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
