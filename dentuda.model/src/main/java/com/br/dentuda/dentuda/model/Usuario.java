package com.br.dentuda.dentuda.model;

import com.br.dentuda.dentuda.model.dao.EntidadeBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Table(name = "usuario")
public class Usuario{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "sobrenome", nullable = false, length = 100)
    private String sobrenome;
    @Column(name = "cpf", nullable = false, unique = true, length = 12)
    private String cpf;
}
