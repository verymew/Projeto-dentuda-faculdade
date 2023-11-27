package com.br.dentuda.models;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}