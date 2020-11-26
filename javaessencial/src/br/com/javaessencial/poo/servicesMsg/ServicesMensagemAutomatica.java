package br.com.javaessencial.poo.servicesMsg;

public class ServicesMensagemAutomatica {

	public void questionamento(String m , String objeto) {
		System.out.println("Informe o (a) " + m + " do (a) "+ objeto +" Que deseja consultar.");
	}
	
	/**
	 * {@summary Metodo espera Receber O item , modelo , Caracteristicas e Unidade de médida}*/
	public void exibir_resultado(String item, String modelo ,String m , String unMedida) {
		System.out.println("Localizamos o Item " + item + " Modelo : " + modelo + " e com a caracterista de : " + m + unMedida +" em nossa base de dados");
		System.out.println("\n Iremos enviar o orçamento para seu E-mail..");
	}
	
	public void exibirErro() {
		System.out.println("Ops ! Você Digitou uma informação Invalida.");
	}
}
