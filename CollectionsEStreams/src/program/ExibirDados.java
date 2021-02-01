package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExibirDados {

	public static void main(String[] args) {
		
		Alunos a = new Alunos("Maxwell",2);
		a.exibir_dados();
		Scanner in = new Scanner(System.in);
		boolean fluxo = true;
		
		List <Alunos> a1 = new ArrayList<Alunos>();
		while(fluxo) {
			System.out.println("Informe Seu nome : ");
			String nome = in.nextLine();
			System.out.println("Informe seu Plano: ");
			int plan = Integer.valueOf(in.nextLine()).intValue();
			a1.add(new Alunos (nome,plan));
			System.out.println("Registro Adicionado ! \n " + a1);
		}


	}

}
