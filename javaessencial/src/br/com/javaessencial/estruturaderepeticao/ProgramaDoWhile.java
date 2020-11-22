package br.com.javaessencial.estruturaderepeticao;

import java.util.Scanner;

/**
 * @author Maxwell.Costa
 * @description Realizar busca de um nome informado pelo usuario, caso o nome
 *              seja identificado retorno uma mensagem , voc� localizou.
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
				System.out.println(" \n Sorry, Voc� n�o conseguiu cumprir o desafio, o Jogo ser� finalizado.");
				break;
			}

			System.out.println("Dos itens abaixo , Qual � o animal que voa ?. \n 1-Gato \n 2-Cachorro \n 3-Passaro");
			n = in.nextInt();

			if (n != 3) {
				System.out.println("Voc� errou :(  , Vamos tentar mais uma vez?");
				tentativas = tentativas - 1;
			}
			if (n == 3) {
				System.out.println("Voc� acertou ! Animal Selecionado foi Passaro.");
			}
		} while (n != 3);
		System.out.println("Etapa Finalizada.");

		in.close();

	}

}
