/**
 * 
 */
package br.com.rpires.domain;

import anotacao.ColunaTabela;
import anotacao.Tabela;
import anotacao.TipoChave;
import br.com.rpires.dao.Persistente;
import jakarta.persistence.*;

/**
 * @author rodrigo.pires
 *
 */
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Persistente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
	@SequenceGenerator(name = "cliente_seq", sequenceName = "sq_cliente", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "CPF", nullable = false, length = 11, unique = true)
    private Long cpf;
    
	@Column(name = "TEL",nullable = false)
    private Long tel;
    
	@Column(name = "ENDERECO", nullable = false, length = 100)
    private String end;
    
	@Column(name = "NUMERO", nullable = false)
    private Integer numero;
    
	@Column(name = "CIDADE", nullable = false)
    private String cidade;
    
	@Column(name = "ESTADO", nullable = false)
    private String estado;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public void setBoolean(int i, Boolean status) {

	}
}
