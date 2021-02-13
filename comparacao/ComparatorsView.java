package comparacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorsView {

	public static void main(String[] args) {
		List<Ponto> pontoEmpresa = new ArrayList<>();

		pontoEmpresa.add(new Ponto(1199, "ANA BEATRIZ", true));
		pontoEmpresa.add(new Ponto(5120, "MAURO", true));
		pontoEmpresa.add(new Ponto(6030, "LUCIA", true));
		pontoEmpresa.add(new Ponto(1140, "JOAO", false));
		pontoEmpresa.add(new Ponto(6050, "MARIA", true));
		pontoEmpresa.add(new Ponto(1060, "MAXWELL", false));

		System.out.println("---------------------[ORDEM DE INSERT UTILIZANDO LIST<>]");
		pontoEmpresa.forEach(System.out::println);

		System.out.println("---------------------[UTILIZANDO COMPARATOR COM LAMBDA]");
		/**
		 * Utilizando o sort não é obrigatorio a implementação das interfaces Comparator
		 * e Comparable omparação realizada o primeiro valor informado é menor que o
		 * segundo ? se for deixe ele no local e compare o proximo
		 * 
		 */
		pontoEmpresa.sort((first, second) -> first.getMatriculaFuncionario() - second.getMatriculaFuncionario());
		pontoEmpresa.forEach(System.out::println);
		/**
		 * Utilizando Collections.sort() - Preciso implementar uma das interfaces para
		 * não receber um erro de compilação.
		 * 
		 */
		System.out.println("-----------------[OBRIGA O IMPLEMENTS COMPARATOR or COMPARABLE]");
		Collections.sort(pontoEmpresa);
		pontoEmpresa.forEach(System.out::println);

		/**
		 * Utiliando Referencia Classe :: método sem os ()
		 */
		System.out.println("-----------------[REFERENCIA] em tempo de execução");
		pontoEmpresa.sort(Comparator.comparingInt(Ponto::getMatriculaFuncionario));
		System.out.println(pontoEmpresa);

		System.out.println("-----------------[REFERENCIA]  ordem reversa");
		pontoEmpresa.sort(Comparator.comparingInt(Ponto::getMatriculaFuncionario).reversed());
		System.out.println(pontoEmpresa);

	}

}
