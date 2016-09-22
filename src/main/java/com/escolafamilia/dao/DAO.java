package com.escolafamilia.dao;

import com.escolafamilia.connection.ConnectionFactory;

public abstract class DAO<T> {
	
	public abstract Class<T> getSuperClass();
	
	public void insert(T model){
		ConnectionFactory.getCurrentEntityManager().persist(model);
	}
	
	public void updade(T model){
		ConnectionFactory.getCurrentEntityManager().merge(model);
	}
	
	public void remove(T model){
		ConnectionFactory.getCurrentEntityManager().remove(model);
	}
	
	public T get(Integer id){
		return ConnectionFactory.getCurrentEntityManager().find(getSuperClass(), id);
	}
}
