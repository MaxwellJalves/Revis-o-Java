package estudoHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Java Util Map n�o � uma interface que extends de java util.Collection
 * Utilizado para correlacionar valores  -DE PARA 
 * pode ser ordenado por comparators
 * N�o � mantido a ordem de inser��o
 * 
 * */
public class UtilizandoMap {

	public static void main(String[] args) {
		
		int idade =10;
		//Para implementa��o passamos a Key e o Value
		// O hashMap ele � performatico
		
		Map<Integer,String>conta = new HashMap();
		
		//N�o possui implementa��o do add;
		 conta.put(1,"Conta Corrente");
		conta.put(1,"Conta Digital");
		conta.put(1,"Conta Poupan�a");
		System.out.println("Primeiro teste Map<K,V>" + conta);
		// O teste Realizado passando 3 Key com o mesmo index faz com que o valor seja atualizado do status inicial para o proxim
		//Conforme o exemplo acima.
		conta.put(1,"Conta Corrente");
		conta.put(2,"Conta Digital");
		conta.put(3,"Conta Poupan�a");
		
		System.out.println("Passando Map<K,V> com K != \n" + conta);
		
		if(conta.containsValue("Conta Corrente")) {
			System.out.println("Conta localizada aguarde. ");
		}
		
		 
		for(int i=0 ; i <= conta.size(); i++) {
			if(conta.get(i) != null)
			System.out.println(conta.get(i));
		}
		
		conta.remove(2);
		System.out.println("Item dois removido");
		for(int i=0 ; i <= conta.size(); i++) {
			if(conta.get(i) != null)
			System.out.println(conta.get(i));
		}
		
		//java 10 Inferencia 
		var teste = Integer.valueOf(10);
		
		System.out.println("Idade: $idade" + teste);
	}

}
