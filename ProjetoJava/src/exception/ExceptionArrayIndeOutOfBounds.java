package exception;

public class ExceptionArrayIndeOutOfBounds {
	
	public static void main (String [] main) {
		
		int codigo [] = new int [5];
		
		for(int i=0; i< codigo.length; i++)
			codigo[i] = i + 3 * 2;
		
		for(int y=0; y < 6 ; y++) {
			try {
				System.out.println(codigo[y]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("A posição do array informada é superior ao tamanho disponivel para armazenar os dados  \n Reveja a sua condição para atender o tamanho esperador :  SIZE = " + codigo.length);
			}
		}
	}

}
