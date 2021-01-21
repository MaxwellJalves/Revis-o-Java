package agregacao;

public class ViewAgregacao {

	public static void main(String[] args) {
		
	 Atleta a1 = new Atleta("Maxwell",30,"Banco");
	 a1.exibir_dados();
	 
	 System.out.println("------------------------------------");
	 
	 Time t1 = new Time("1234", 20,"Sei não" ,"IBIS");
	 t1.exibir_dados();
	 System.out.println("Atleta = " + a1.getNome() +"\n TIME  = " + t1.getNome());
	 
	}

}
