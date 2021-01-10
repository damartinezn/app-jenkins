package com.clearminds.deberes.entidades;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	private String numeracion;

	public void imprimir(){
		System.out.println("Calle Principal : " + this.callePrincipal+ " Calle Secundaria : "+this.calleSecundaria+ " NUmeracion : " +this.numeracion);
	}
	
	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
}
