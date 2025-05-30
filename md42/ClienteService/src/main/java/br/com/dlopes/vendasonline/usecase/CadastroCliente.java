package br.com.dlopes.vendasonline.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.dlopes.vendasonline.domain.Cliente;
import br.com.dlopes.vendasonline.repository.IClienteRepository;
import jakarta.validation.Valid;

public class CadastroCliente {
	private IClienteRepository clienteRepository;
	
	@Autowired
	public CadastroCliente(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente cadastrar(@Valid Cliente cliente) {
		return this.clienteRepository.insert(cliente);
	}

	public Cliente atualizar(@Valid Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}
}
