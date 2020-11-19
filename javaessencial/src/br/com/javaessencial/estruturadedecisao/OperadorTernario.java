package br.com.javaessencial.estruturadedecisao;

/**
 * @author Maxwell.Costa Atribuindo o valor para duas variavel do tipo inteiro e
 *         utiizando as estruturas de decisão If , Else e o operador ternario
 *         para validar o retorno de ambos no console
 */
public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = 10, numero = 0;

		if (valor < 7) {
			numero = valor;
		} else {
			valor++;
		}

		System.out.println("Valor : " + valor + " Numero : " + numero);

		numero = (valor < 7) ? valor : valor++;
		System.out.println("Valor : " + valor + " Numero : " + numero);

	}

}
