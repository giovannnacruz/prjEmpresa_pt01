package com.Giovanna.PrjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name="tb_Funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long funcodigo;

	@NotNull
	private String funnome;


@DateTimeFormat(pattern = "dd/MM/yyyy")
   private LocalDate funnascimento;

	@NotNull
	private double funsalario;
	
	public Funcionario() {
		
	}

	public Funcionario(Long funcodigo, String funnome, LocalDate funnascimento, Double funsalario) {
		super();
		this.funcodigo = funcodigo;
		this.funnascimento = funnascimento;
		this.funsalario = funsalario;
		this.funnome = funnome;
	}

	public Long getFuncodigo() {
		return funcodigo;
	}

	public void setFuncodigo(Long funcodigo) {
		this.funcodigo = funcodigo;
	}

	public String getFunnome() {
		return funnome;
	}

	public void setFunnome(String funnome) {
		this.funnome = funnome;
	}
	public LocalDate getFunnascimento() {
		return funnascimento;
	}

	public void setFunnascimento(LocalDate funnascimento) {
		this.funnascimento = funnascimento;
	}


	public Double getFunsalario() {
		return funsalario;
	}

	public void setFunsalario(Double Funsalario) {
		this.funsalario = funsalario;
	}
	
}

