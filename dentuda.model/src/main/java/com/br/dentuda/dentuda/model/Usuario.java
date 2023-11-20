package com.br.dentuda.dentuda.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
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
    @Column(name = "cpf", nullable = false, unique = true, length = 12)
    private String cpf;

    public Usuario(Integer id, String nome, String sobrenome, String cpf){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    //Getters
    public String getCpf() {
        return cpf;
    }
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    //Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
