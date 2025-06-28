package com.mycompany.tplp332110.model;

import java.util.List;
import javax.persistence.EntityManager;

public class EnderecoDAO implements GenericDAO<Endereco> {

    private EntityManager em;

    public EnderecoDAO() {
        this.em = EntintyManagerObjectFactory.getEM();
    }

    @Override
    public Endereco add(Endereco entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Endereco update(Endereco entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public void remove(Endereco entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public Endereco getByID(long id) {
        return em.find(Endereco.class, id);
    }

    @Override
    public List<Endereco> getALL() {
        return em.createQuery("SELECT e FROM Endereco e", Endereco.class).getResultList();
    }
}
