package com.br.dentuda.models;

import com.br.dentuda.models.dao.EntidadeBase;
import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
public class Usuario implements EntidadeBase {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Override
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}