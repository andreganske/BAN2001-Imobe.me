package com.imobme.server.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.imobme.server.model.Endereco;

@Stateless
public class EnderecoRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    public void create(Endereco endereco) throws Exception {
        em.persist(endereco);
    }

}
