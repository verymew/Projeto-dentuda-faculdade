package com.br.dentuda.dentuda.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    //id da consulta
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    //Se nao tiver registro, o usuário nao pagou e vai mostrar lá.
    @ManyToOne
    @JoinColumn(name = "id")
    private Consultas consulta;

    @Temporal(TemporalType.DATE)
    private Date data_consulta;


}
