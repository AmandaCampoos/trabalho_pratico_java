package com.mycompany.tplp332110.model;

import java.util.List;
import javax.persistence.EntityManager;

public class DisciplinaDAO implements GenericDAO<Disciplina> {

    private EntityManager em;

    public DisciplinaDAO() {
        this.em = EntintyManagerObjectFactory.getEM();
    }

    @Override
    public Disciplina add(Disciplina entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Disciplina update(Disciplina entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public void remove(Disciplina entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public Disciplina getByID(long id) {
        return em.find(Disciplina.class, id);
    }

    @Override
    public List<Disciplina> getALL() {
        return em.createQuery("SELECT d FROM Disciplina d", Disciplina.class).getResultList();
    }
}
