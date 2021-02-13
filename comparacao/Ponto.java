package comparacao;

//implements Comparable<Ponto>
public class Ponto implements Comparable<Ponto> {

	private Integer matriculaFuncionario;
	private String nomeFuncionario;
	private boolean statusFuncionario;

	public Ponto(Integer m, String n, boolean status) {
		this.matriculaFuncionario = m;
		this.nomeFuncionario = n;
		this.statusFuncionario = status;
	}

	public Integer getMatriculaFuncionario() {
		return this.matriculaFuncionario;
	}

	public String getNomeFuncionario() {
		return this.nomeFuncionario;
	}

	public boolean getStatus() {
		return this.statusFuncionario;
	}

	@Override
	public String toString() {
		return "	Matricula   : " + getMatriculaFuncionario() + "   Funcionario : " + getNomeFuncionario()
				+ " - ESTA TRABALHANDO ? : " + ((getStatus() == true) ? "SIM" : "NÃO");
	}


	@Override
	public int compareTo(Ponto o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
