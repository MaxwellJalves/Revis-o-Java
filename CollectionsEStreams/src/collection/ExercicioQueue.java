package collection;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

	public static void main(String[] args) {
		
		Queue <String> filaDeAtendimento = new LinkedList<String>();
		
		filaDeAtendimento.add("Juliana");
		filaDeAtendimento.add("Pedro");
		filaDeAtendimento.add("Carlos");
		filaDeAtendimento.add("Larissa");
		filaDeAtendimento.add("João");
		
		String emAtendimento = filaDeAtendimento.poll();
		System.out.println(emAtendimento);
		
		System.out.println("Posição do cliente : " + filaDeAtendimento.contains("Larissa") 
												   + filaDeAtendimento.hashCode()
												   + filaDeAtendimento.toString()
												   + filaDeAtendimento.equals("Larissa")
												   + filaDeAtendimento.toArray());
		String proximoDaFila = filaDeAtendimento.peek();
		System.out.println(proximoDaFila);
		
		String aFilaAndou = filaDeAtendimento.poll();
		System.out.println("Em Atendimento \t" + aFilaAndou.toString().toUpperCase());
		
		proximoDaFila = filaDeAtendimento.peek();
		System.out.println("\n [Queue] \n - Próximo da Fila \t :" + proximoDaFila);
		
		System.out.println("\n Exibindo Clientes por ordem de chegada. \n");
		for(String exibirClientes : filaDeAtendimento)
			System.out.println(exibirClientes);
		
		//Todos os atendimentos foram finalizados.
		filaDeAtendimento.clear();
		//Consultando se ainda existe clientes para ser atendido
		
		String check = ((filaDeAtendimento.peek() != null) ? "Ainda existe cliente esperando." : "Todos os clientes foram atendidos.");
		System.out.println(check);
		
		System.out.println(filaDeAtendimento);

	}

}
