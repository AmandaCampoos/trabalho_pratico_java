package com.mycompany.tplp332110.model;

import java.util.List;
import javax.persistence.EntityManager;

public class CursoDAO implements GenericDAO<Curso> {

    private EntityManager em;

    public CursoDAO() {
        this.em = EntintyManagerObjectFactory.getEM();
    }

    @Override
    public Curso add(Curso entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Curso update(Curso entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public void remove(Curso entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public Curso getByID(long id) {
        return em.find(Curso.class, id);
    }

    @Override
    public List<Curso> getALL() {
        return em.createQuery("SELECT c FROM Curso c", Curso.class).getResultList();
    }
}
