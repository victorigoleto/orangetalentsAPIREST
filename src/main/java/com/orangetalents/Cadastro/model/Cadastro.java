package com.orangetalents.Cadastro.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

//TABELA
@Entity
@Table(name="tb_cadastro")
public class Cadastro {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Este campo não pode ser vazio")
	private String nome;
	
	@NotEmpty(message="Este campo não pode ser vazio")
	@Email
	private String email;
	
	@NotEmpty(message="Este campo não pode ser vazio")
	@Size(min = 11, max = 11, message="CPF deve ter 11 numeros")
	@CPF
	private String cpf;
	
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date nascimento;

	//METODOS GET E SET
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
}
