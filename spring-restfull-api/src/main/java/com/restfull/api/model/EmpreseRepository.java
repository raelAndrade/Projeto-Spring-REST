package com.restfull.api.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpreseRepository extends JpaRepository<Empresa, Long> {
	Empresa findByCnpj(String cnpj);
}
