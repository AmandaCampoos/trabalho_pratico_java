package com.mycompany.tplp332110.model;

import java.util.List;
import javax.persistence.EntityManager;

public class ProfessorDAO implements GenericDAO<Professor> {

    private EntityManager em;

    public ProfessorDAO() {
        this.em = EntintyManagerObjectFactory.getEM();
    }

    @Override
    public Professor add(Professor entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Professor update(Professor entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public void remove(Professor entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public Professor getByID(long id) {
        return em.find(Professor.class, id);
    }

    @Override
    public List<Professor> getALL() {
        return em.createQuery("SELECT p FROM Professor p", Professor.class).getResultList();
    }
}
