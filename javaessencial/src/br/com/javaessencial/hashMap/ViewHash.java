package br.com.javaessencial.hashMap;

import java.util.HashMap;
import java.util.Map;

public interface ViewHash {

	public static void main (String [] args) {
		Cliente c1 = new Cliente("Maxwell Jeronimo", 200);
		Cliente c2 = new Cliente("Ana      Beatriz", 1000);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		Map<String,Cliente> lista = new HashMap<String,Cliente>();	
		lista.put("Equipe Tecnica", c1);
		lista.put("Equipe Medica", c2);


		System.out.println((lista.size() > 3 ? "NUMERO DE REGISTROS INFORMADOS SUPERAM A QUANTIDADE LIMIDATA NAS CONFIGURACOES DO SISTEMA!" 
				: "\n CRITERIO ATUAL RESPEITA AS CONFIGURAÇOES DO SISTEMA! \nEXIBINDO OS DADOS .. \n\n"));
		
		System.out.println("HASH => { "+ lista.get("Equipe Tecnica"));
		System.out.println("MAP =>  { " + lista.get("Equipe Medica"));
	}
}
