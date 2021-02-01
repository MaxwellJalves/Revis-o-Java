package program;
import java.util.List;
import java.util.ArrayList;
/**
 * @author Maxwell.Costa
 * @description Informe o nome no aluno e o plano*/
public class Alunos extends Plano{

	private List <Integer> academia = new ArrayList<Integer>();
	private String nome;
	private List <String> mat = new ArrayList<String>();
	

	public Alunos(String n ,int p) {
		super(p);
		this.nome = (n.isEmpty()? "Não informado" : n);
		mat.add(" - " + this.nome + "\t - " + getPlano() );
	}
	
	
	public void exibir_dados() {
		System.out.println(mat);
	}
	
	@Override
		public String toString() {
		StringBuilder sb = new StringBuilder();
			for(String paraCada : mat) {
				sb.append( "\n" + paraCada );
			}
			return sb.toString();
		}
}
