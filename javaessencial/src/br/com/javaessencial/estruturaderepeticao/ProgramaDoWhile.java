package br.com.javaessencial.estruturaderepeticao;

import java.util.Scanner;

/**
 * @author Maxwell.Costa
 * @description Realizar busca de um nome informado pelo usuario, caso o nome
 *              seja identificado retorno uma mensagem , você localizou.
 */
public class ProgramaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int tentativas = 2;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Numeros de Tentativas " + tentativas);
			if (tentativas == 0) {
				System.out.println(" \n Sorry, Você não conseguiu cumprir o desafio, o Jogo será finalizado.");
				break;
			}

			System.out.println("Dos itens abaixo , Qual é o animal que voa ?. \n 1-Gato \n 2-Cachorro \n 3-Passaro");
			n = in.nextInt();

			if (n != 3) {
				System.out.println("Você errou :(  , Vamos tentar mais uma vez?");
				tentativas = tentativas - 1;
			}
			if (n == 3) {
				System.out.println("Você acertou ! Animal Selecionado foi Passaro.");
			}
		} while (n != 3);
		System.out.println("Etapa Finalizada.");

		in.close();

	}

}
