import java.util.ArrayList;
import java.util.LinkedList;

public class UseCase05 {
    public static void main(String[] args) {

        ArrayList unidadeFederativa = new ArrayList(2);
        unidadeFederativa.add("PE");
        unidadeFederativa.add("SP");
        unidadeFederativa.add("RJ");

        unidadeFederativa.forEach(System.out::println);

        System.out.printf("Objento a quantidade de unidades Federativas da lista %s",unidadeFederativa.size() + "\n");


        ArrayList estados = new ArrayList(unidadeFederativa);
        estados.add("Pernambuco");
        estados.add("São Paulo");
        estados.add("Rio de Janeiro");

        var UF = "PE";


        System.out.println(estados.contains(unidadeFederativa.get(0))? "Sim : " : "Não");

        estados.add("PE");
        System.out.println("Estados"+estados);
        System.out.println(estados.get(6).equals(UF));


    }
}
