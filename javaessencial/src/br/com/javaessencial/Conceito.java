package br.com.javaessencial;
/**
 * Estruturado
 * */
import java.util.Scanner;
public class Conceito {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			String municipios [] = new String[5];
			String n;
			boolean validar = true;
			int contador= 0;
			
			System.out.println("Informe a UF que voc� reside com dois caracteres");
			n = in.nextLine().toUpperCase();
			
			
			System.out.println((n.equals("PE") ? "TRUE" : "FALSE") + " VALOR DA VARIAVEL" + n);
			
			if(n.equals("PE") == true) {
				System.out.println("Listando MUNICIPIOS..");
				if (municipios[0] == null) {
					System.out.println("Voc� n�o possui Municipios vinculado a esse Uf deseja cadastrar ? \n 1 - SIM  :  \n 2 - N�O");
					int y = Integer.parseInt(in.nextLine());
					if(y == 2 ) {
						System.out.println("Saindo da aplica��o");

					}else {

					while(contador <municipios.length) {
						  if(municipios[contador] == null) {
							  System.out.println("  - Informe o nome do "+(contador == contador ? (contador+1) :(contador+1))+ "� m�nicipio que deseja inserir.");
							  municipios[contador] = in.nextLine();
							  contador++; 
						  }else {
								  System.out.println("algo deu errado");
						  }
						  
					  }
					  //listando dados cadastrados
					  for(int i =0 ; i <municipios.length; i++) {
						 System.out.println(municipios[i]);
					  }
					  //confirmando se o usuario deseja confirmar os dados digitados
					  System.out.println("Os dados Exibidos est�o corretos ? caso queira editar algum informe o n�mero do m�nicipio que deseja alterar");
					  int controlador = Integer.parseInt(in.nextLine());
					  if(controlador < municipios.length) {
						  System.out.println("Informe o valor correto");
						  municipios[controlador] = in.nextLine();
					  }
					  //listando dados cadastrados
					  for(int i =0 ; i <municipios.length; i++) {
						 System.out.println(municipios[i]);
					  }
					 System.out.println("edi��o Realizada com sucesso \n Fim do Algoritimo");
					}
				}else {
					System.out.println("carregando os dados aguarde");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			in.close();
		}

	}


}
