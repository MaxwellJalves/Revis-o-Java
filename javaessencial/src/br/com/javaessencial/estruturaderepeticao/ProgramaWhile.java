package br.com.javaessencial.estruturaderepeticao;

import java.util.Scanner;
public class ProgramaWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int conta = 0;
		int contador = 0;
		int controlador = 0;
		double saque = 0;
		double deposito = 0;

		while (contador != 1) {
			System.out.println("Informe o número da sua conta com 5 digitos");
			conta = Integer.parseInt(in.nextLine());
			try {
				
				if (conta > 19999) {
					contador = 1;
				}
				if (conta < 19999) {
					System.out.println("Por padrão o primeiro digito da conta inicia com 2 \n \n Vamos tentar novamente ?");
				}
			} catch (Exception e) {
				System.out.println("Verifique os dados ");
			}

		}
		contador = 0;

		while (contador != 1) {
			while(controlador == 0) {
				System.out.println(
						"\n Pressione 1 - Para sacar \n Pressione 2 - Para Depositar \n Pressione 3 - Para cancelar a Operação");
				controlador = Integer.parseInt(in.nextLine());
				if(controlador > 3) {
					controlador =0;
					System.out.println("opção não localizada");
					
				}else {
					contador= 1;
				}
				
			}

			if (controlador != 0) {
				switch (controlador) {
				case 1:
					System.out.println("Informe o valor que deseja sacar!");
					saque = in.nextDouble();
					exibir(conta, saque, deposito);
					contador = 1;
					break;
				case 2:
					System.out.println("Informe o valor que deseja Depositar");
					deposito = in.nextDouble();
					exibir(conta, saque, deposito);
					contador = 1;
					break;
				case 3:
					System.out.println("Finalizando a aplicação.");
					contador = 1;
					break;

				}
				in.close();
				
			}
		}
	}
	/**
	 * @author Maxwell.Costa
	 * @param Recebe como parametro o número da conta , o valor do saque e o valor de deposito*/
	private static void exibir(int c, double s, double d) {
		System.out.println("Extrato".toLowerCase() + " \nConta : " + c + " 0" + " \n Valor do Saque " + s
				+ "\n Valor deposito R$" + d);
	}

}
