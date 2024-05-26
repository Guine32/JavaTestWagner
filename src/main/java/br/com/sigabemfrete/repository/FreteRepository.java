package br.com.sigabemfrete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sigabemfrete.entity.Frete;;

public interface FreteRepository extends JpaRepository<Frete, Long> {
}

