package model.entity;

public class Conta {
    private int numeroDaConta;
    private Cliente cliente;

    public Conta (int codigo,Cliente cliente){
        this.cliente = cliente;
        this.numeroDaConta = codigo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroDaConta=" + numeroDaConta +
                ", cliente=" + cliente +
                '}';
    }
}
