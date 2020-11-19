package br.com.javaessencial.estrutura;

import java.util.Scanner;
/**
 * @author Maxwell.Costa
 * 
 *         Objetivo : Crie um algoritimo que receba um valor do usu�rio e
 *         realize a seguinte valida��o: Se o valor informado pelo usuario seja
 *         superior a 100 informe saldo n�o disponivel se valor inferior informe
 *         aguarde a impress�o.
 */
public class CondicaoIf {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int valor;
		System.out.println("Informe o valor que deseja sacar...");
		valor = in.nextInt();

		try {
			if (valor < 0) {
				System.out.println("Valor minimo para saque � de 0,01");
			} else if (valor > 100) {
				System.out.println("Saldo n�o disponivel!");
			} else {
				System.out.println("Aguarde a impress�o");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

		


	}

}
