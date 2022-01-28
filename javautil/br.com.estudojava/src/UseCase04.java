import model.entity.Cliente;
import model.entity.Conta;

import java.util.ArrayList;

public class UseCase04 {
    public static void main(String[] args) {
        /*java 11   -  Obs: O generics entrou no java apartir da versão  1.7 onde conseguimos tipar/garantir que o dado
        sejá igual ao esperado na implementação. */

        var cliente01 = new Cliente("Maxwell","Dev");

        var cliente02 = new Cliente("Aroldo","Pompeu");

        var conta01 = new Conta(1010,cliente01);
        var conta02 = new Conta(2020,cliente02);

        var clientes = new ArrayList<Conta>();
        clientes.add(conta01);
        clientes.add(conta02);

        System.out.println("|| - CLIENTES REGISTRADOS NA BASE DE DADOS - ||");
        clientes.forEach(System.out::println);


        var obterNomeDoPrimeiroCliente = clientes.get(0);
        System.out.println("Seja bem vindo ! \n" + obterNomeDoPrimeiroCliente.getCliente().getNome());
        System.out.println("Agencia: 000  | Conta : "+ obterNomeDoPrimeiroCliente.getNumeroDaConta());
    }
}
