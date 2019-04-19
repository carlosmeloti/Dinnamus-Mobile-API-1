package br.dinnamus.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="itenstabelapreco")
public class ItensTabelaPreco {

	@Id
	@Column(name="chaveunica")
	private Long chaveunica;
	
	@Column(name="codigoproduto")
	private Long codigoproduto;
	
	@Column(name="precovenda")
	private Double precovenda;
	
	/*@OneToMany(mappedBy = "itensGradeProduto", orphanRemoval = true)
    private List<CadProduto> produtos;*/


	public Long getChaveunica() {
		return chaveunica;
	}

	public void setChaveunica(Long chaveunica) {
		this.chaveunica = chaveunica;
	}

	public Long getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(Long codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public Double getPrecovenda() {
		return precovenda;
	}

	public void setPrecovenda(Double precovenda) {
		this.precovenda = precovenda;
	}
	
	/*

	public List<CadProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<CadProduto> produtos) {
		this.produtos = produtos;
	}
*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chaveunica == null) ? 0 : chaveunica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItensTabelaPreco other = (ItensTabelaPreco) obj;
		if (chaveunica == null) {
			if (other.chaveunica != null)
				return false;
		} else if (!chaveunica.equals(other.chaveunica))
			return false;
		return true;
	}
	
	
}
