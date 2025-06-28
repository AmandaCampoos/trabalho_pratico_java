package com.mycompany.tplp332110.model;

import java.util.List;
import javax.persistence.EntityManager;

public class AlunoDAO implements GenericDAO<Aluno> {

    private EntityManager em;

    public AlunoDAO() {
        this.em = EntintyManagerObjectFactory.getEM();

    }

    @Override
    public Aluno add(Aluno entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Aluno update(Aluno entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public void remove(Aluno entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public Aluno getByID(long id) {
        return em.find(Aluno.class, id);
    }

    @Override
    public List<Aluno> getALL() {
        return em.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();
    }
}
