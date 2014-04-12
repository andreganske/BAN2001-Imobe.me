package com.imobme.server.rest;

import java.awt.Event;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/events")
@RequestScoped
public class EventService {

	@Inject
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getAllEvents() {
		return em.createQuery("select * from Event").getResultList();
	}
}
