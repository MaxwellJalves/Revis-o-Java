package br.com.javaessencial.poo.view;

import java.util.Scanner;

import br.com.javaessencial.poo.model.Cadeira;
import br.com.javaessencial.poo.servicesMsg.ServicesMensagemAutomatica;

public class ViewInteracao {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean validacao = true;
		ServicesMensagemAutomatica sm = new ServicesMensagemAutomatica();
		Cadeira cadeira = new Cadeira();
		double comparador = 1;

		try {
			while (validacao == true) {

				sm.questionamento("altura","cadeira");
				cadeira.setAltura(Double.parseDouble(in.nextLine().replace(',', '.')));
				
				sm.questionamento("Tipo","cadeira");
				cadeira.setTipo(in.nextLine());
				
				if(comparador > cadeira.altura()) {
					sm.exibir_resultado("Cadeira", cadeira.tipo(), String.valueOf(cadeira.altura())," CM ");
				}else {
					sm.exibir_resultado("Cadeira", cadeira.tipo(), String.valueOf(cadeira.altura())," MT ");
				}
				System.out.println("\n Deseja Escolher outra caidera ?  \n Tecle 'S' para sim e 'N' para Não");
				if (in.nextLine().toUpperCase().contains("N")) {
					validacao = false;
					System.out.println("Obrigado pela preferencia!");
					break;
				}
			}

		} catch (Exception e) {
			@SuppressWarnings("unused")
			String erro = e.toString();
			System.out.println(
					"Ops Você informou um caracter invalido no lugar da Virgula utilize o Ponto (.), fica a dica - ;)");

		} finally {
			in.close();
		}

	}

}
