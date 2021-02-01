package program;

public class Plano {

	private String plano;
	public Plano() {}
	public Plano(int p) {
		this.plano = ((p==1)?"Plano Slim" : "Plano Master");
	}
	
	public String getPlano() {
		return this.plano.toUpperCase();
	}
	
	
}
