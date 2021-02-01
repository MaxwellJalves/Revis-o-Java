package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aluno = new Vector<>();
		aluno.add("Maxwell");
		aluno.add("Bia");
		System.out.println(aluno);
		List<String> s = new ArrayList <String> ();
		s.add("new");
		aluno.addAll(s);
		
		System.out.println(aluno);
	}

}
