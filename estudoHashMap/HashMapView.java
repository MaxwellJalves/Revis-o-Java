package estudoHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapView {

	public static void main(String[] args) {
		
		Map<String,String> cidades = new HashMap();
		cidades.put("RS", "PORTO ALEGRE");
		cidades.put("PB", "JOAO PESSOA");
		cidades.put("TO", "PALMAS");
		cidades.put("RJ", "RIO DE JANEIRO");
		System.out.println(cidades);
		cidades.put("go", null);
		cidades.put("RS", null);
		cidades.put(null, "TESTE");
		cidades.put(null, "novo");
		System.out.println("RETORNO" + cidades);
		
		
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		List<String> cliente = new ArrayList<>();
		cliente.add("JOSE");
		cliente.add("MARIA");
		cliente.add("DALVA");
		cliente.add("ZULEIDE");
		
		Map<List<Integer>,List<String>> banco = new HashMap<>();
		banco.put(lista ,cliente);
		
		for(Map.Entry<List<Integer>,List<String>> n: banco.entrySet()) {
			n.getKey().forEach(	 y -> System.out.println(y));
			n.getValue().forEach(j -> System.out.println(j));
			}
		
		for(List<Integer> key : banco.keySet()) {
			key.forEach(System.out::println);
		}
		
		System.out.println(banco);

	}

}
