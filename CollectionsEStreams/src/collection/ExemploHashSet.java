package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Double> nota = new HashSet<>();
		
		//add
		
		nota.add(7.4);
		 nota.add(null);
		nota.add(8.4);
		//nota.add(8.4); //registros duplicados apenas o primeiro será exibido
		//nota.add(10.0);

	    System.out.println(nota);
	    
	    //removendo
	    nota.remove(8.4);
	   // nota.add(9.2);
	    nota.add(null);
	   
	    System.out.println(nota);
	    
	    //tamanho
	    System.out.println(nota.size());
	    
	    //Iterator
	    
	    Iterator <Double> i = nota.iterator();
	    while(i.hasNext()) 
	    	System.out.println(i.next());
	    
	    }

}
