/**
 * 
 */
package br.com.rpires.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import br.com.rpires.dao.DAOException;
import br.com.rpires.dao.Persistente;
import br.com.rpires.dao.TipoChaveNaoEncontradaException;
import jakarta.persistence.*;

/**
 * @author rodrigo.pires
 *
 */
@Entity
@Table(name ="TB_VENDA")
public class Venda implements Persistente {
	
	public enum Status {
		INICIADA, CONCLUIDA, CANCELADA;

		public static Status getByName(String value) {
			for (Status status : Status.values()) {
	            if (status.name().equals(value)) {
	                return status;
	            }
	        }
			return null;
		}
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venda_seq")
	@SequenceGenerator(name = "venda_seq", sequenceName = "seq_venda", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "CODIGO", nullable = false, length = 10)
	private String codigo;


	@ManyToOne
	@JoinColumn(name = "id_cliente_fk",
		foreignKey = @ForeignKey(name = "fk_venda_cliente"),
			referencedColumnName = "id", nullable = false
	)
	private Cliente cliente;
	
	@OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<ProdutoQuantidade> produtos;
	
	@Column(name = "VALOR_TOTAL", nullable = false)
	private BigDecimal valorTotal;
	
	@Column(name = "DATA_VENDA", nullable = false)
	private Instant dataVenda;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS_VENDA", nullable = false)
	private Status status;
	
	public Venda() {
		produtos = new HashSet<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<ProdutoQuantidade> getProdutos() {
		return produtos;
	}

	public void adicionarProduto(Produto produto, Integer quantidade, Integer estoque) throws DAOException, TipoChaveNaoEncontradaException {
		validarStatus();
		Optional<ProdutoQuantidade> op =
				produtos.stream().filter(filter -> filter.getProduto().getCodigo().equals(produto.getCodigo())).findAny();
		if (op.isPresent()) {
			ProdutoQuantidade produtpQtd = op.get();
			produtpQtd.adicionar(quantidade, estoque);
		} else {
			// Criar fábrica para criar ProdutoQuantidade
			ProdutoQuantidade prod = new ProdutoQuantidade();
			prod.setProduto(produto);
			prod.adicionar(quantidade, estoque);
			produtos.add(prod);


		}
		recalcularValorTotalVenda();
	}

	private void validarStatus() {
		if (this.status == Status.CONCLUIDA) {
			throw new UnsupportedOperationException("IMPOSSÍVEL ALTERAR VENDA FINALIZADA");
		}
	}
	
	public void removerProduto(Produto produto, Integer quantidade) {
		validarStatus();
		Optional<ProdutoQuantidade> op =
				produtos.stream().filter(filter -> filter.getProduto().getCodigo().equals(produto.getCodigo())).findAny();
		
		if (op.isPresent()) {
			ProdutoQuantidade produtpQtd = op.get();
			if (produtpQtd.getQuantidade()>quantidade) {
				produtpQtd.remover(quantidade);
				recalcularValorTotalVenda();
			} else {
				produtos.remove(op.get());
				recalcularValorTotalVenda();
			}
			
		}
	}
	
	public void removerTodosProdutos() {
		validarStatus();
		produtos.clear();
		valorTotal = BigDecimal.ZERO;
	}
	
	public Integer getQuantidadeTotalProdutos() {
		// Soma a quantidade getQuantidade() de todos os objetos ProdutoQuantidade
		int result = produtos.stream()
		  .reduce(0, (partialCountResult, prod) -> partialCountResult + prod.getQuantidade(), Integer::sum);
		return result;
	}
	
	public void recalcularValorTotalVenda() {
		//validarStatus();
		BigDecimal valorTotal = BigDecimal.ZERO;
		for (ProdutoQuantidade prod : this.produtos) {
			valorTotal = valorTotal.add(prod.getValorTotal());
		}
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public Instant getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Instant dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setProdutos(Set<ProdutoQuantidade> produtos) {
		this.produtos = produtos;
	}
	
	
	
}
