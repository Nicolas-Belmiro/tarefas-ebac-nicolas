package domain;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TB_PROJETO")
public class Projeto {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @ManyToMany(mappedBy = "projetos")
    private Set<Empregado> empregados = new HashSet<>();
}