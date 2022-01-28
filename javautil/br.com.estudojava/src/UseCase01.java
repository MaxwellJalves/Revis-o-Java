import model.entity.Cliente;
import model.entity.Conta;

public class UseCase01 {

    public static void main(String [] args){
        for(String argumentos : args){
            System.out.println(argumentos);
        }

        Cliente c1 = new Cliente("Maxwell","Silva");
        System.out.println(c1);

        Conta conta = new Conta(1,c1);

        Object[] contas = new Object[5];
        contas[0] = c1;
        contas[1]= conta ;

        for (Object obj : contas){
            System.out.println(obj);
        }
    }
}
