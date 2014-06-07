package com.imobme.server.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.imobme.server.model.Pessoa;

@Stateless
public class PessoaRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    public void create(Pessoa pessoa) throws Exception {
        em.persist(pessoa);
    }

}
