import model.entity.Cliente;
import model.entity.Conta;

public class UseCase02 {

    public static void main(String[] args) {
        AbstraindoOArrayDoMain itens = new AbstraindoOArrayDoMain();

        Cliente cliente = new Cliente("Joao","Francisco");

        Conta conta = new Conta(1,cliente);

        itens.adicionar(cliente);

        itens.adicionar(conta);

        var quantidade = itens.obterQuantidadeDeRegistrosUtilizados();

        System.out.println("Quandidade de itens adicionados : " + quantidade);

        System.out.println(itens.obtemItemSelecionado(0));

    }
}
