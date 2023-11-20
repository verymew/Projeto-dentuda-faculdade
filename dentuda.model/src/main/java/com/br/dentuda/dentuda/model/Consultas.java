package com.br.dentuda.dentuda.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "consultas")
public class Consultas {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date data_consulta;

    @ManyToOne
    @JoinColumn(name = "id")
    private Usuario user;
}
