package br.com.javaessencial.estruturaderepeticao;
/* Criando fluxo que demanda a utilização do POO*/
import java.util.Scanner;
public class ProgramaGeral {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("informe seu Nome");
			adicionarRegistro(in.nextLine());
			System.out.println("Rotina Será Finalizada.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			in.close();
		}

	}
	@SuppressWarnings("unused")
	public static void  adicionarRegistro(String descricao) {
		String n[][] = new String [3][3];
		//inserir valores
		int contRegSalvos = 0;
		
		for(int i=0 ; i <n.length;i++) {
			
				if(n[i][contRegSalvos]== null && contRegSalvos == i)
			    
				banco(contRegSalvos,descricao);
				contRegSalvos++;
				break;
			
		}
		  
	}
   public static void banco(int index,String nome) {
	   String log[]=new String[2];
	   if(log[index] == null) {
		   log[index]=nome;   
	   }
	   System.out.println(log[index]);
   }

}
