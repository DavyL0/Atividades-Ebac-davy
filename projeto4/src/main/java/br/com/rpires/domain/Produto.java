/**
 * 
 */
package br.com.rpires.domain;

import java.math.BigDecimal;

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
@Table(name = "TB_PRODUTO")
public class Produto implements Persistente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "produto_seq")
	@SequenceGenerator(name = "produto_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "NOME", length = 50, nullable = false)
	private String nome;

	@Column(name = "DESCRICAO", length = 50, nullable = false)
	private String descricao;
	
	@Column(name = "VALOR", nullable = false)
	private BigDecimal valor;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

