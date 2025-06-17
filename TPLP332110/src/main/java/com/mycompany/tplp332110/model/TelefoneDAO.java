/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.model;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author renato
 */
public class TelefoneDAO implements GenericDAO<Telefone> {

    @Override
    public Telefone add(Telefone entity) {
        EntityManager em = EntintyManagerObjectFactory.getEM();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return entity;
        } catch (Exception e) {
            if(em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            
            System.err.println("Problemas ao salvar o telefone: " + e.getMessage());
            throw new RuntimeException("Problemas ao salvar o telefone", e);
        } finally {
            if(em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    @Override
    public Telefone update(Telefone entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Telefone entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Telefone getByID(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Telefone> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
