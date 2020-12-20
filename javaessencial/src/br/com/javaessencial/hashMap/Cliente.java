package br.com.javaessencial.hashMap;

/**
 * @author Maxwell.Costa
 * @param Metodo construtor obriga que seja passado dois paramentros nome e Saldo do Cliente*/
public class Cliente {
	
	private String nome;
	private double saldo;
	
	public Cliente (String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome : " + getNome())
		.append(" \t Saldo :"+getSaldo());
		return sb.toString();
	}
}
