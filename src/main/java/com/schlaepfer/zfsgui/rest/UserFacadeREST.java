package com.schlaepfer.zfsgui.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.schlaepfer.zfsgui.entities.User;

public class UserFacadeREST extends AbstractFacade<User> {
	
	@PersistenceContext
    protected EntityManager em;

    public UserFacadeREST() {
        super(User.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	@PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(User entity) {
        super.edit(entity);
    }

	@GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<User> getAll() {
        return super.getAll();
    }
	
	@GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }
}
