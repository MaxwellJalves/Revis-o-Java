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
			
			System.out.println("Informe a UF que você reside com dois caracteres");
			n = in.nextLine().toUpperCase();
			
			
			System.out.println((n.equals("PE") ? "TRUE" : "FALSE") + " VALOR DA VARIAVEL" + n);
			
			if(n.equals("PE") == true) {
				System.out.println("Listando MUNICIPIOS..");
				if (municipios[0] == null) {
					System.out.println("Você não possui Municipios vinculado a esse Uf deseja cadastrar ? \n 1 - SIM  :  \n 2 - NÃO");
					int y = Integer.parseInt(in.nextLine());
					if(y == 2 ) {
						System.out.println("Saindo da aplicação");

					}else {

					while(contador <municipios.length) {
						  if(municipios[contador] == null) {
							  System.out.println("  - Informe o nome do "+(contador == contador ? (contador+1) :(contador+1))+ "º múnicipio que deseja inserir.");
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
					  System.out.println("Os dados Exibidos estão corretos ? caso queira editar algum informe o número do múnicipio que deseja alterar");
					  int controlador = Integer.parseInt(in.nextLine());
					  if(controlador < municipios.length) {
						  System.out.println("Informe o valor correto");
						  municipios[controlador] = in.nextLine();
					  }
					  //listando dados cadastrados
					  for(int i =0 ; i <municipios.length; i++) {
						 System.out.println(municipios[i]);
					  }
					 System.out.println("edição Realizada com sucesso \n Fim do Algoritimo");
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
