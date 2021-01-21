package exception;

import java.util.Scanner;

public class ExceptionInputdadosUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Informe um n�mero para que possamos realizar a divis�o");
		int n1 = Integer.valueOf(in.nextLine().replace(".", "")).intValue();
		System.out.println("Informe segundo numero para dividir com o primeiro valor informado.");
		int n2 = Integer.valueOf(in.nextLine().replace(".","")).intValue();

		System.out.println("\n a Divis�o dos n�meros informado retorna o valor de : \t" + dividir(n1,n2));
		
		in.close();
	 
	}

	 static int dividir(int n1 , int n2) {
		 try {
			 return n1/n2;
		 }catch(ArithmeticException e) {
			 System.out.println("OPS!!  N�o � possivel a divis�o por 0, adicionando o valor Default [0]");
			 return 0;
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return 0;
	}
}
