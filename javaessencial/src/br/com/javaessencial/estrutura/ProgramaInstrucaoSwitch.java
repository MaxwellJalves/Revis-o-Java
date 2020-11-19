package br.com.javaessencial.estrutura;
/**
 * @author Maxwell.Costa
 * @info Utilizando  a instru��o Switch para simular uma atendente virtual que ir� se apresentar
 * e fazer 3 perguntas e no final ir� exibir um retorno para o usuario baseado nas informa��es
 * passada pelo Usuario.*/
import java.util.Scanner;

public class ProgramaInstrucaoSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome, profissao, hobby;
		int validacao = 0;
		System.out.println("Ola!   Me chamo Bia - Sou sua atendente Virtual. \n Qual � o seu nome ?");
		nome = in.nextLine().toUpperCase();

		System.out.println("Sej� bem vindo (�) " + nome + "\n Para continuar preciso fazer mais duas perguntinhas");

		System.out.println(
				"Qual � a sua profiss�o atual ?  irei gerar uma lista onde voc� ir� selecionar apenas uma das op��es");
		System.out.println("\n 1 - Vendedor \n 2 - Gerente \n 3 - Desenvolvedor \n 4 - Dentista \n 5 - Outros");
		validacao = Integer.parseInt(in.next());
		profissao = "";
		try {
			switch (validacao) {
			case 1:
				profissao = "Vendedor(a)";
				break;
			case 2:
				profissao = "Gerente";
				break;
			case 3:
				profissao = "Desenvolvedor";
				break;
			case 4:
				profissao = "Dentista";
				break;
			case 5:
				profissao = "Outros";
			default:
				break;
			}
			System.out.println("Profiss�o " + profissao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		validacao = 0;
		System.out.println("\n selecione um hobby que mais se adequa a seu perfil.");
		System.out.println(
				"\n 1 - Sair Para balada \n 2 - Tocar viol�o \n 3 - Ir a Praia \n 4 - Jogar Futbol \n 5 - Outros");
		validacao = Integer.parseInt(in.next());

		hobby = "";
		try {
			switch (validacao) {
			case 1:
				hobby = "Baladeiro";
				break;
			case 2:
				hobby = "M�sico";
				break;
			case 3:
				hobby = "Praieiro";
				break;
			case 4:
				hobby = "Peladeiro";
				break;
			case 5:
				hobby = "Outros";
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			in.close();
		}

		System.out.println("Interessante seu perfil ...");
		System.out.println("Voc� tem a fun��o de " + profissao.toUpperCase() + "\n  � " + hobby +" ... #Desenrrolado(a).");
		
		System.out.println("Irei pesquisar a melhor carteira de credito que se adeque ao seu perfil, \n continue navegando em nosso site em breve Irei aparecer em um Poupup. \n Com novidades para voc�.");
		
	}

}
