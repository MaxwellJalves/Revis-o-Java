package clininaOdonto.model;

public class Pessoa {

	private String nome;
	private int idade;
	private String cor;
	private String sexo;
	
	
	public Pessoa(String nome, int idade, String cor, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		this.sexo = sexo;
	}
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	public String getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	Nome 	: ").append(getNome())
		  .append(" Idade	: ").append(getIdade());
		  sb.append(getCor()  == null ? "" : " Cor		: " + getCor());		  
		  sb.append(" Sexo	: ").append(getSexo()); 
		return sb.toString();
	}
	
	
}
