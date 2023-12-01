package com.br.dentuda.models;

import com.br.dentuda.models.dao.EntidadeBase;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pagamento")
public class Pagamento implements EntidadeBase {
    //id da consulta
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    //Se nao tiver registro, o usuário nao pagou e vai mostrar lá.
    @ManyToOne
    @JoinColumn(name = "id_consulta")
    private Consultas consulta;

    @Temporal(TemporalType.DATE)
    private Date data_consulta;
}
