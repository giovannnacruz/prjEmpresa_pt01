package com.Giovanna.PrjEmpresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Giovanna.PrjEmpresa.Service.DepartamentoService;
import com.Giovanna.PrjEmpresa.Service.FuncionarioService;
import com.Giovanna.PrjEmpresa.entities.Departamento;
import com.Giovanna.PrjEmpresa.entities.Funcionario;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	//@GetMapping("/home")
		@GetMapping("/home")
	    public String paginaInicial() {
	        return "index"; // Nome do seu arquivo HTML (sem a extensão)
	    }
		private final FuncionarioService funcionarioService;
		
		@Autowired
		public FuncionarioController(FuncionarioService FuncionarioService) {
			this.funcionarioService = FuncionarioService;		
		}
		@GetMapping("/{id}")	
	    public ResponseEntity<Funcionario> getFuncionario(@PathVariable Long funcodigo) {
			Funcionario funcionario = funcionarioService.getFuncionarioById(funcodigo);
	        if (funcionario != null) {
	            return ResponseEntity.ok(funcionario);
	        } else {	
	            return ResponseEntity.notFound().build();
	        }
	    }	
		@PostMapping
		public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
			return funcionarioService.saveFuncionario(funcionario);
		}
		
		@GetMapping
		public List<Funcionario> getAllFuncionario(){
			return funcionarioService.getAllFuncionarios();
		}
		
		@DeleteMapping("/{id}")
		public void deleteFuncionario(@PathVariable Long funcodigo) {
			funcionarioService.deleteFuncionario(funcodigo);
		}
		

	}
