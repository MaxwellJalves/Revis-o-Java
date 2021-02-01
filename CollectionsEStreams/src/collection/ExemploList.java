package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> curso = new ArrayList<String>();
		
		curso.add("Desenvolvimento");
		curso.add("Administra��o");
		curso.add("Engenharia");
		curso.add("Odonto");
		
	    //ordena��o por inser��o
		System.out.println("\n  -- Crescente");
		for(int i=0; i < curso.size(); i++)
			System.out.println(curso.get(i));
		
		//Ordena��o do ultimo ao primeiro
		System.out.println("\n\n  --Decrescente");
		for(int i=(curso.size()-1); i > -1 ; i--) {
			try {
				System.out.println(curso.get(i));
			}catch(IndexOutOfBoundsException e) {
				System.out.println("OPS  \t Index maior que a quantidade de valores.");
			}
		}

		//Ordenando por ordem alfabetica [Utilizando Collections.]
		Collections.sort(curso);
		System.out.println("----List m�todo Sort() Ordem alfabetica \n" + curso);

		//Interface List   - utilizando o Set - utilizando para alterar o valor de uma posi��o de uma lista
		//
		System.out.println("\n\n----List m�todo set() Altandor valor de  uma posi��o \n" + curso);
		curso.set(0, "Alterando valor");
		
		System.out.println(curso);
		
		//M�todo [Remove]
		System.out.println("\n\n Metodo REMOVE");
		try {
			curso.remove(3);
			curso.remove("Engenharia");  //Removendo pelo nome do Objeto.
			System.out.println("registro removido com sucesso!");
			System.out.println(curso);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Registro n�o localizado..");
		}
		//Metodo contains - retorna true ou false em uma lista.
		
		//Metodo isEmpty() - retorna true ou false se a lista possui ou n�o elementos.
		
		//Metodo Clear()  -  Limpa todos os dados de uma lista
		
		//Metodo indexOf  - retorna um  inteiro informando o index de um objeto - utilizando para pegar o index em uma lista se n�o localizar retorna -1
		
		curso.add("NOVO CURSO");
		curso.add("foreach");
		
		//Imperativo
		for(String nome : curso) {
			System.out.println(nome);
		}
		
		
		//Interator                //Passando a lista utilizamos o while
		
		Iterator<String> list = curso.iterator(); //return  o Iterator de String  
		//hasNext()   retorna  true sempre que tiver um objeto na lista. 
		//ser� retornado false quando n�o tiver mais registros.
		while(list.hasNext()) {
		
			System.out.println(list.next());
		}
		
		System.out.println();
		
		
	}
}
