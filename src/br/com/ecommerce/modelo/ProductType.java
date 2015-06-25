package br.com.ecommerce.modelo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class ProductType {
	
	private Long id;
	
	@NotNull @Size(min=5, message="{producttype.form.descricao.tamanho}")
	private String nome;
	
	@NotNull
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}
