package model.entity;

import java.util.UUID;

public class Cliente {
    private UUID id ;
    private String nome;
    private String sobreNome;

    public Cliente(String nome, String sobreNome){
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.sobreNome = sobreNome;

    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                '}';
    }
}
