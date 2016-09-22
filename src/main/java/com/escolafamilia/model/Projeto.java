package com.escolafamilia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String projeto;
	private Date registered;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public Date getRegistered() {
		return registered;
	}
	public void setRegistered(Date registered) {
		this.registered = registered;
	}
}
