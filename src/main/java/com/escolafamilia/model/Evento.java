package com.escolafamilia.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String namePerson;
	private int agePerson;
	private boolean isVisitor;
	private Date dateEvent;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Universitario universitario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public int getAgePerson() {
		return agePerson;
	}

	public void setAgePerson(int agePerson) {
		this.agePerson = agePerson;
	}

	public boolean isVisitor() {
		return isVisitor;
	}

	public void setVisitor(boolean isVisitor) {
		this.isVisitor = isVisitor;
	}

	public Date getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public Universitario getUniversitario() {
		return universitario;
	}

	public void setUniversitario(Universitario universitario) {
		this.universitario = universitario;
	}
}
