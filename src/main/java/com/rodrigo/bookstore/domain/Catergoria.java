package com.rodrigo.bookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Catergoria {

	private int id;
	private String nome;
	private String descricao;

	private List<Livro> livros = new ArrayList<>();

	public Catergoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Catergoria(int id, String nome, String descricao, List<Livro> livros) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.livros = livros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catergoria other = (Catergoria) obj;
		return id == other.id;
	}

}
