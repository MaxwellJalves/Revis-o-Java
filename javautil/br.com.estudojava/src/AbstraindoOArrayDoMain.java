public class AbstraindoOArrayDoMain {

    private Object[] objetos;
    private int indexDisponivel;

    public AbstraindoOArrayDoMain(){
        this.objetos = new Object[5];
        this.indexDisponivel = 0;
    }

    public void adicionar(Object adicionar){
        this.objetos[indexDisponivel] = adicionar;
        this.indexDisponivel ++;
    }


    public int obterQuantidadeDeRegistrosUtilizados(){
        return this.indexDisponivel;
    }

    public Object obtemItemSelecionado(int item){
        return  this.objetos[item];
    }


}
