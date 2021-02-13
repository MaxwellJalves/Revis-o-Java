package comparacao;

import java.util.Comparator;

public class ComparatorRegra implements Comparator<Ponto> {

	@Override
	public int compare(Ponto o1, Ponto o2) {
		
		return o1.getMatriculaFuncionario() - o2.getMatriculaFuncionario();
	}

	
}
