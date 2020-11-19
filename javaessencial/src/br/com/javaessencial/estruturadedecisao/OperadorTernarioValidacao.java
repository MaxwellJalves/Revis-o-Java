package br.com.javaessencial.estruturadedecisao;

import java.util.Scanner;
public class OperadorTernarioValidacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario = 0, desconto = 0, saldo = 0;
		System.out.println("Informe o salario do funcionario");
		salario = in.nextDouble();
		try {
			if (salario < 0) {
				System.out.println("Verifique o valor digitado.");
			} else {
				desconto = (salario > 1180) ? 0.11 * salario : 0.08 * salario;
				saldo = salario - desconto;
				System.out.println("Salario Bruto : R$ " + salario);
				System.out.println("Desconto : R$ " + desconto);
				System.out.println("Valor a Receber : R$ " + saldo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			in.close();
		}

		


	}

}
