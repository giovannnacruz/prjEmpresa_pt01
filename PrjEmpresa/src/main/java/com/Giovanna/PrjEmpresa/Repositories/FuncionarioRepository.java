package com.Giovanna.PrjEmpresa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Giovanna.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
}