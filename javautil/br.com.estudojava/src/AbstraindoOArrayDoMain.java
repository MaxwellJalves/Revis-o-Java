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
        if(item == 0){
            return this.objetos[0];
        }
        return  this.objetos[item-1];
    }


}
