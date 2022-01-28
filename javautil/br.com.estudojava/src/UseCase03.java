import java.util.ArrayList;

public class UseCase03 {
    public static void main(String[] args) {

        ArrayList<Object>  lista = new ArrayList<>();
        lista.add("Maxwell");
        lista.add("Joao");
        lista.add(10);


        for(Object usuario: lista){
            System.out.println(usuario);
        }

        lista.remove(2);

        System.out.println("Item na posição 2 removido com sucesso");

        lista.forEach(System.out::println);

        System.out.println("Quantidade de Registros : "+lista.size());


    }
}
