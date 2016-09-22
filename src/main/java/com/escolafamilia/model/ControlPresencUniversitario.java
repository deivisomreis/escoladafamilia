package com.escolafamilia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ControlPresencUniversitario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date dateEvent;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Universitario universitario;
	private boolean status;
	private String justify;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getJustify() {
		return justify;
	}
	public void setJustify(String justify) {
		this.justify = justify;
	}
}
