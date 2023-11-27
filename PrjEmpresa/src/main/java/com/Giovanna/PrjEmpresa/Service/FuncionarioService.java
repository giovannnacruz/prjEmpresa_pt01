package com.Giovanna.PrjEmpresa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Giovanna.PrjEmpresa.Repositories.DepartamentoRepository;
import com.Giovanna.PrjEmpresa.Repositories.FuncionarioRepository;
import com.Giovanna.PrjEmpresa.entities.Departamento;
import com.Giovanna.PrjEmpresa.entities.Funcionario;
@Service
public class FuncionarioService {

private final FuncionarioRepository funcionarioRepository;
	
	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository =funcionarioRepository;
	}
	//preparando as buscas por id
		public Funcionario getFuncionarioById(Long funcodigo) {
			return funcionarioRepository.findById(funcodigo).orElse(null);
		}
		//preparando a busca geral	
		public  List<Funcionario> getAllFuncionarios(){
			return funcionarioRepository.findAll();
		}
		//salvando o Jogo	
		public Funcionario saveFuncionario(Funcionario funcionario) {
			return funcionarioRepository.save(funcionario);		
		}
		//excluindo o Jogo	
		public void deleteFuncionario(Long funcodigo){
			funcionarioRepository.deleteById(funcodigo);	
		}	

}
	
