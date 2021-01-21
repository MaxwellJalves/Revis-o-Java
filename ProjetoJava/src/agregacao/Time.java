package agregacao;


/**
 * @author maxwell.costa
 * @description método construtor espera receber 4 paramentros nome, idade, posição do atleta e Nome do time
 * */
public class Time extends Atleta {
	
	String nomo_do_time;

	public Time(String n, int i, String p,String nt) {
		super(n,i,p);
		this.nomo_do_time = nt;
	}
	public String getNomeTime() {
		return nomo_do_time;
	}
	
	void exibir_dados() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Nome do Atleta   :    \t").append(getNome())
		  .append("\n Idade do Atleta  : 	\t").append(getIdade())
		  .append("\n Posicao do Atleta: 	\t").append(getPosicao())
		  .append("\n Nome do Time     :	\t").append(getNomeTime());
		System.out.println(sb.toString());
	}
}
