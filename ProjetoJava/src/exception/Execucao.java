package exception;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		System.out.println("Informe um número para que possamos realizar a divisão");
		int n1 = Integer.valueOf(in.nextLine().replace(".", "")).intValue();
		System.out.println("Informe segundo numero para dividir com o primeiro valor informado.");
		int n2 = Integer.valueOf(in.nextLine().replace(".","")).intValue();

		try {
			System.out.println("\n a Divisão dos números informado retorna o valor de : \t" + divisao(n1,n2));
		}catch(ArithmeticException e ) {
			System.out.println("Divisao impossivel");
		}catch(Exception e) {
			System.out.println("Ops, Verifique os paramentros de entrada.");
		}

		
		in.close();

	}
	
	public static int divisao (int n1, int n2) throws Exception{
		return n1/n2;
	}

}
