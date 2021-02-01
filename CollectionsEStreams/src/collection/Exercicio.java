package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = new ArrayList<String>();
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");

		// Navegue na lista exibindo os dados
		System.out.println(nomes);
		// Alterando o nome de carlos por pedro.
		nomes.set(2, "Roberto");
		System.out.println(nomes);
		// Retornando o nome na primeira posição
		System.out.println(nomes.get(0));
		// retornando o nome da posição 4
		System.out.println(nomes.get(4));
		// remova o João
		nomes.remove("João");
		System.out.println(nomes);
		// retorne a quantidade itens na lista
		System.out.println(nomes.size());
		// verifique se o nome Juliana existe
		System.out.println((nomes.contains("Juliana")) ? "Nome Existente" : "Registro não localizado");

		// Criando uma segunda lista
		List<String> segundaLista = new ArrayList<String>();
		segundaLista.add("Ismael");
		segundaLista.add("Rodrigo");
		segundaLista.add("Andre");
		// adicione todos os itens da primeira lista na segunda e exiba os dados
		segundaLista.addAll(nomes);
		System.out.println(segundaLista);
		// Ordene os dados por ordem alfabetica
		Collections.sort(segundaLista);
		System.out.println(segundaLista);
		// limpando dados da lista
		// segundaLista.clear();
		// Verificando se a lista está vazia
		System.out.println((segundaLista.isEmpty()) ? "Lista Vazia" : "Lista contém dados");

		System.out.println("\n -[Foreach ---] \n");
		for (String exibirRegistros : segundaLista)
			System.out.println(exibirRegistros);

		// Iterator
		@SuppressWarnings("rawtypes")
		Iterator in = segundaLista.iterator();
		System.out.println("\n  -[Iterator] \n");
		while (in.hasNext()) {
			System.out.println(in.next());
		}

	}

}
