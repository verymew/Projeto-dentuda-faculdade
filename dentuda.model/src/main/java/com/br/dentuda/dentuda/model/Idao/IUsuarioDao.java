package com.br.dentuda.dentuda.model.Idao;

import com.br.dentuda.dentuda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {
}
