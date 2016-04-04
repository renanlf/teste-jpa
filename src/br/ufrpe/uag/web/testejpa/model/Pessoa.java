package br.ufrpe.uag.web.testejpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@NamedQuery(name="buscaPessoas", query="select pessoa from Pessoa pessoa")
@Entity
public class Pessoa {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false, length=100)
	private String nome;
	
	@Column(nullable=false, unique=true, length=11)
	private String cpf;
	
	@Column(nullable=false, length=20)
	private String senha;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}

}
