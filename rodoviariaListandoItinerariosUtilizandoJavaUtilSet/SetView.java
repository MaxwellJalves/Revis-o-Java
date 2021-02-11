package rodoviariaListandoItinerariosUtilizandoJavaUtilSet;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Maxwell.Costa
 * Estudo Java Collections java.util.set
 * Objetivo  Cadastrar passagens
 *           - Listar passagem por um valor
 *           - Listar passagem referente a um determinado destino
 *           - Limpar todos os dados da lista
 *           - Listar todos os dados na tela utilizando ForEach da classe Set
 *           */
public class SetView {

	public static void main(String[] args) {

		Set<Passagem> rodoviaria = new HashSet<>();

		// Criando uma lista de Itinerarios para viagens

		rodoviaria.add(new Passagem("CARUARU", "10/02/2021", 			 55.));
		rodoviaria.add(new Passagem("JOÃO PESSOA", "10/02/2021", 		 100.));
		rodoviaria.add(new Passagem("RIO DE JANEIRO", "10/02/2021",		 "503.2"));
		rodoviaria.add(new Passagem("RIO DE JANEIRO", "10/02/2021", 	 280.4));
		rodoviaria.add(new Passagem("RIO GRANDE DO NORTE", "10/02/2021", 340.));
		rodoviaria.add(new Passagem("RIO GRANDE DO NORTE", "11/02/2021", 280.));
		rodoviaria.add(new Passagem("RIO GRANDE DO NORTE", "13/02/2021", 240.));
		



		/*
		 * Instacie uma variavel e atribuindo um valor com scala de dois , logo após
		 * percorra a lista exibindo apenas as passagem cuja o valor seja informado na
		 * variavel valorRecebido -- input
		 */
		
		BigDecimal valorRecebido = new BigDecimal("280").setScale(2);

		/*-- Output*/
		for (Passagem p : rodoviaria)
			if (p.getValor().equals(valorRecebido)) {
				System.out.println(p);
			}
		
		System.out.println("/* Exiba todos os dias de viagem para um determinado Estado*/");
		/* Exiba todos os dias de viagem para um determinado Estado */
		for (Passagem itinerario : rodoviaria) {
			if (itinerario.getDestino().equals("RIO GRANDE DO NORTE")) {
				System.out.println(itinerario);
			}
		}
		
		System.out.println(" ----------Listando todos os dados ------ ");
		System.out.println(" ---------##Begin----- ");
		rodoviaria.forEach(System.out::println);

		System.out.println(" ---------- End;------ ");
		//limpando os dados
		rodoviaria.clear();
		//realizando uma nova chamada para confirmar a exclusão dos dados
	    rodoviaria.forEach(consumer -> System.out.println("LAMBDA ->" +  consumer));
	}

}
