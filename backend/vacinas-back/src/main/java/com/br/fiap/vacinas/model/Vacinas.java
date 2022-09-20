package com.br.fiap.vacinas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import java.time.LocalDate;

@Entity
public class Vacinas {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_id_seq")
	@SequenceGenerator(name = "entity_id_seq", sequenceName = "public.vacinas_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Long id;
	private Long cpf;
	private LocalDate data_nasc;
	private LocalDate data_vac;
	private String endereco;
	private String grupo_prioridade;
	private String nome;
	private String nome_mae;
	private String nome_pai;
	private String sexo;
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public LocalDate getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}

	public LocalDate getData_vac() {
		return data_vac;
	}

	public void setData_vac(LocalDate data_vac) {
		this.data_vac = data_vac;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGrupo_prioridade() {
		return grupo_prioridade;
	}

	public void setGrupo_prioridade(String grupo_prioridade) {
		this.grupo_prioridade = grupo_prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}

	public String getNome_pai() {
		return nome_pai;
	}

	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
