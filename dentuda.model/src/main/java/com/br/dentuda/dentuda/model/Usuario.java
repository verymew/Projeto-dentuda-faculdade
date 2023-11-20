package com.br.dentuda.dentuda.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@AllArgsConstructor
@Setter
@Getter
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "sobrenome", nullable = false, length = 100)
    private String sobrenome;

}
