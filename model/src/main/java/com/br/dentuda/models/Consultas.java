package com.br.dentuda.models;

import com.br.dentuda.models.dao.EntidadeBase;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "consultas")
public class Consultas implements EntidadeBase {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date data_consulta;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario user;
}
