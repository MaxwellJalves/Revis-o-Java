package br.odonto.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import clininaOdonto.model.Dentista;

public class Atendimento {

	public static void main(String[] args) {
		
		List<Dentista> dentistas = new ArrayList<>();
		dentistas.add(new Dentista("ANA BEATRIZ", 26, "BRANCO", "FEMININO","CLINICO GERAL", 12345));
		dentistas.add(new Dentista("MAXWELL COSTA", 26, "BRANCO", "FEMININO","PERIO", 12345));
		dentistas.add(new Dentista("JOAQUI", 26, "BRANCO", "FEMININO","MAXILO", 12345));
		dentistas.add(new Dentista("Junio BEATRIZ", 26, "BRANCO", "FEMININO","CLINICO GERAL", 12345));

		Optional<Dentista> optionalListaDentistas;

		for(Dentista d : dentistas) {	
			if(d.getEspecialidade().contains("CLINICO")) {
				optionalListaDentistas= Optional.ofNullable(d);
				optionalListaDentistas.ifPresentOrElse(System.out::println , () -> System.out.println("Registro não localizado"));		
			}
		}
		//Fazendo a varredura e forçando o recebimento do null
		for(Dentista d : dentistas) {	
			if(d.getEspecialidade().contains("CLINICO")) {
				optionalListaDentistas= Optional.ofNullable(null);
				optionalListaDentistas.ifPresentOrElse(System.out::println , () -> System.out.println("Registro não localizado"));		
			}
			
		}
		
		Optional <String> valor = Optional.ofNullable("VALOR");
		valor.map((n) -> n.concat(" : Concatenado")).ifPresent(System.out::println);

	
		
	}

}
