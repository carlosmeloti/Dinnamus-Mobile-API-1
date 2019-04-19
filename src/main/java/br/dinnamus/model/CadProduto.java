package br.dinnamus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class CadProduto {

	@Id
	private Long chaveunica;
	
	private Long codigo;
		
	private String nome;

	private String cor;
	
	private String tamanho;
	
	private Double precovenda;

	public Long getChaveunica() {
		return chaveunica;
	}

	public void setChaveunica(Long chaveunica) {
		this.chaveunica = chaveunica;
	}

	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Double getPrecovenda() {
		return precovenda;
	}

	public void setPrecovenda(Double precovenda) {
		this.precovenda = precovenda;
	}
	
	
	
	
	
	
}
