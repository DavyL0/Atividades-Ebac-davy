/**
 * 
 */
package br.com.rpires.domain;

import java.math.BigDecimal;

import anotacao.ColunaTabela;
import anotacao.Tabela;
import anotacao.TipoChave;
import br.com.rpires.dao.Persistente;
/**
 * @author rodrigo.pires
 *
 */
@Tabela("TB_PRODUTO")
public class Produto implements Persistente {
	
	@ColunaTabela(dbName = "id", setJavaName = "setId")
	private Long id;

	@TipoChave("getCodigo")
	@ColunaTabela(dbName = "codigo", setJavaName = "setCodigo")
	private String codigo;
	
	@ColunaTabela(dbName = "nome", setJavaName = "setNome")
	private String nome;
	
	@ColunaTabela(dbName = "descricao", setJavaName = "setDescricao")
	private String descricao;
	
	@ColunaTabela(dbName = "valor", setJavaName = "setValor")
	private BigDecimal valor;

	//	TAREFA MOD30 -------------------------------------------
	@ColunaTabela(dbName = "pacote", setJavaName = "setPacote")
	private String pacote;

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}
//	-------------------------------------------------------------

//	TAREFA DIFICIL
@ColunaTabela(dbName = "estoque", setJavaName = "setEstoque")
private Integer estoque;

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}


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

	public void setDesconto(BigDecimal desconto) {
	}

	public BigDecimal getDesconto() {
		return valor;
	}
}
