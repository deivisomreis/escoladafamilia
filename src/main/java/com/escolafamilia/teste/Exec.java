package com.escolafamilia.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.escolafamilia.connection.ConnectionFactory;
import com.escolafamilia.model.Evento;
import com.escolafamilia.model.EventoLock;

public class Exec {

	public static void main(String[] args) throws ParseException {
		List<Evento> listaEvento = new ArrayList<>();
		SimpleDateFormat sdfIn = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdfOut = new SimpleDateFormat("dd/MM/yyyy");
		
		for(int i = 0; i < 10; i++){
			Evento evento = new Evento();
			evento.setAgePerson(26);
			evento.setNamePerson("Deivison Reis" + " - " + i);
			evento.setVisitor(true);
			evento.setDateEvent(sdfIn.parse(sdfIn.format(new Date())));
			evento.setUniversitario(null);

			listaEvento.add(evento);
		}
		
		ConnectionFactory.getCurrentEntityManager().getTransaction().begin();
		for(Evento evento : listaEvento){
			ConnectionFactory.getCurrentEntityManager().persist(evento);
		}
		ConnectionFactory.getCurrentEntityManager().getTransaction().commit();
		
	}
}
