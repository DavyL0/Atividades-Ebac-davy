package br.com.dlopes.vendasonline.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dlopes.vendasonline.domain.Cliente;
import br.com.dlopes.vendasonline.usecase.BuscarCliente;
import br.com.dlopes.vendasonline.usecase.CadastroCliente;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value="/cliente")
public class ClienteResource {
	private BuscarCliente buscarCliente;
	private CadastroCliente cadastroCliente;
	
	@Autowired
	public ClienteResource(BuscarCliente buscarCliente, CadastroCliente cadastroCliente) {
		
		
		this.buscarCliente = buscarCliente;
		this.cadastroCliente = cadastroCliente;
	}
	
	@GetMapping
	public ResponseEntity<Page<Cliente>> buscar(Pageable pageable){
		return ResponseEntity.ok(buscarCliente.buscar(pageable));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody @Valid Cliente cliente ){
		return ResponseEntity.ok(cadastroCliente.cadastrar(cliente));
	}
	
	
}
