package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

	public static void main(String[] args) {
		Queue<String> filaDeBanco = new LinkedList<String>();
		filaDeBanco.add("Juliana");
		filaDeBanco.add("Pedro");
		filaDeBanco.add("Carlos");
		filaDeBanco.add("Larissa");
		filaDeBanco.add("Jo�o");
    
		System.out.println(filaDeBanco);
		//Collections.sort(filaDeBanco);// n�o pussui o metodo ordena��o utilizada na interface List utilizando collections
	
	}

}
