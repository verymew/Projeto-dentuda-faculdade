package com.br.dentuda.dentuda.model.Idao;

import com.br.dentuda.dentuda.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPagamentoDao extends JpaRepository<Pagamento, Integer> {
}
