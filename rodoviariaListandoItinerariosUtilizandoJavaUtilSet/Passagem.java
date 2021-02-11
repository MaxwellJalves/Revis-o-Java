package rodoviariaListandoItinerariosUtilizandoJavaUtilSet;

import java.math.BigDecimal;
import java.util.Date;
import java.text.DateFormat;
/**
 * @author Maxwell.Costa
 * @description Informe o destino, dia e valor 
 * */
public class Passagem {

	private String destino;
	private String dia;
	private BigDecimal valor;
	/**
	 * @param Recebe um Double na implementação*/
	public Passagem(String destino, String dia, Double valor) {
		this.destino = destino;
		this.dia = dia;
		this.valor = new BigDecimal(valor).setScale(2,2);
	}
	/**
	 * @param Recebe uma String na implementação*/
	public Passagem(String destino, String dia, String valor) {
		this.destino = destino;
		this.dia = dia;
		this.valor = new BigDecimal(valor).setScale(2) ;
	}
	/**
	 * @param Recebe um Int na implementação*/
	public Passagem(String destino, String dia, int valor) {
		this.destino = destino;
		this.dia = dia;
		this.valor = new BigDecimal(valor).setScale(2) ;
	}
	public String getDestino() {
		return destino;
	}

	public String getDia() {
		return dia;
	}

	public BigDecimal getValor() {
		return valor;
	}

	
	@Override
		public String toString() {
			return  "\n Destino : " + getDestino()	+ 
					"\n Dia : " + 	getDia()    	+
					"\n Valor R$ "+ getValor() 	+" \n".toString();
		}
	
	
}
