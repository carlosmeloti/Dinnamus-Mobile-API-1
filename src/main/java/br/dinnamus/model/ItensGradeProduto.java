package br.dinnamus.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="itensgradeproduto")
public class ItensGradeProduto {
	
	@Id
	@Column(name="chaveunica")
	private Long chaveunica;
	
	@Column(name="codigo")
	private Long cod;
	
	@Column(name="cor")
	private String cor;
	
	@Column(name="tamanho")
	private String tamanho;
	
	/*@OneToMany(mappedBy = "itensTabelaPreco", orphanRemoval = true)
    private List<CadProduto> produtos;*/

	
	
	public Long getChaveunica() {
		return chaveunica;
	}

	public void setChaveunica(Long chaveunica) {
		this.chaveunica = chaveunica;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
		

	/*public List<CadProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<CadProduto> produtos) {
		this.produtos = produtos;
	}*/

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
		ItensGradeProduto other = (ItensGradeProduto) obj;
		if (chaveunica == null) {
			if (other.chaveunica != null)
				return false;
		} else if (!chaveunica.equals(other.chaveunica))
			return false;
		return true;
	}
	
	

}
