package domain;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "data")
    private Instant data;

    @ManyToOne
    private Curso curso;
}