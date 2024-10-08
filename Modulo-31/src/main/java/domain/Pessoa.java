package domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="TB_PESSOA")
public class Pessoa {

    @Id
    @Column(name="ID")
    private long id;

    @Column(name="nome")
    private String nome;

    @ElementCollection
    @CollectionTable(name="apelidos")
    @Column(name="apelido_pessoa")
    private Collection<String> apelidos;

    @ElementCollection
    @CollectionTable(name="cliente_enderecos")
    private Collection<Endereco> endereco;

    public Pessoa() {
        this.apelidos = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<String> getApelidos() {
        return apelidos;
    }

    public void setApelidos(Collection<String> apelidos) {
        this.apelidos = apelidos;
    }

    public void addApelido(String apelido) {
        this.apelidos.add(apelido);
    }

}