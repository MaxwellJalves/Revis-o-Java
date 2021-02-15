package clininaOdonto.model;

public class Dentista extends Pessoa{

	private String especialidade;
	private int cro;
	
	public Dentista(String n, int i, String c, String s, String es , int cro) {
		super(n,i,c,s);
		this.especialidade = es.toUpperCase();
		this.cro = cro;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public int getCro() {
		return this.cro;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	Nome : ").append(getNome().toUpperCase())
		  .append(" Idade: ").append(getIdade());
		  sb.append(getCor()  == null ? "" : " Cor: " + getCor());		  
		  sb.append(" Sexo: ").append(getSexo())
		    .append(" Especialidade : ").append(getEspecialidade())
		    .append(" Nr CRO  :").append(getCro());
		return sb.toString();
	}
}
