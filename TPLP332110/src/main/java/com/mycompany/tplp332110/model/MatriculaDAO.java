package com.mycompany.tplp332110.model;

import java.util.List;
import javax.persistence.EntityManager;

public class MatriculaDAO implements GenericDAO<Matricula> {

    private EntityManager em;

    public MatriculaDAO() {
        this.em = EntintyManagerObjectFactory.getEM();
    }

    @Override
    public Matricula add(Matricula entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Matricula update(Matricula entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public void remove(Matricula entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public Matricula getByID(long id) {
        return em.find(Matricula.class, id);
    }

    @Override
    public List<Matricula> getALL() {
        return em.createQuery("SELECT m FROM Matricula m", Matricula.class).getResultList();
    }
}
