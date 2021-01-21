package agregacao;

/**
 * @author maxwell.costa
 * @description método construtor espera receber 3 paramentros nome, idade e posição do atleta
 * */


public class Atleta {
	
	protected String nome;
	private int idade;
	private String posicao;

	public Atleta(String n, int i, String p) {
		
		//Tratando Exception java.lang.StringIndexOutOfBoundsException: begin 0, end 5, length 4
		if(n.length() < 5 ) {
			this.nome = n.toUpperCase(); //Sem tratamento
		}else {
			this.nome = n.toUpperCase().substring(0,5); //Caso o valor recebido na View seja inferior a substring(0,5) 0,5  irá retornar a exception
		}
		this.idade = Integer.valueOf(i).intValue();
		this.posicao = String.valueOf(p).toString();
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
	void exibir_dados() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Nome do Atleta : 	\t").append(getNome())
		.append("\n Idade do Atleta  : 	\t").append(getIdade())
		.append("\n Posicao do Atleta: 	\t").append(getPosicao());
		System.out.println(sb.toString());
	}
	
}
