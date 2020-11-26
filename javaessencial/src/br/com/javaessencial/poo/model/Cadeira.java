package br.com.javaessencial.poo.model;

import br.com.javaessencial.poo.contrato.Icadeira;

/**
 * @author Maxwell.Costa
 * @version 1.0.1
 * {@summary Classe possui dois metodos construtores o primeiro obriga Informar altura e tipo da cadeira e o segundo permite acessar os metodos modificadores}
 * Tarefas : Entregar dia 30/11 Implementar opção do usuario escolher a cor do objeto.
 * 
 * Objetivo: Utilizar Programação Orientada a Objeto para resolver todas as problematicas diarias, Exemplicar com coisas do cotidiano, para 
 * facilitar e fixar os tópidos estudado.*/
public class Cadeira implements Icadeira{

	private double alt;
	private String  tipo;
	private String cor;
	
	//Metodo construtor que obriga a passagem dos parametros
	public Cadeira(int i, String t,String cor) {
		this.alt =i;
		this.tipo =t;
		this.cor = cor;
	}
	//metodo Default - permite utilizar os metodos modificadores
	public Cadeira() {
		
	}

	
	@Override
	public double altura() {
		// TODO Auto-generated method stub
		return getAltura();
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return getTipo();
	}
	@Override
	public String cor() {
		return getCor();
	}

	
	public double getAltura() {
		return this.alt;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setAltura(double i) {
		this.alt = i;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
		
	}
	public void setCor(String c) {
        this.cor = c;
	}
}
