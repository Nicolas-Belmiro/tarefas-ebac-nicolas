package domain;

import jakarta.persistence.*;




import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "TB_EMPREGADO")
public class Empregado {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @ElementCollection
    @CollectionTable(name="TB_EMPREGADOS_TELEFONES")
    @MapKeyColumn(name="tipo_telefone")
    @Column(name="numero_telefone")
    private Map<String, String> numeroTelefones;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "TB_EMPREGADO_PROJETO",
            joinColumns = { @JoinColumn(name = "empregado_id") },
            inverseJoinColumns = { @JoinColumn(name = "projeto_id") }
    )
    Set<Projeto> projetos = new HashSet<>();
}
