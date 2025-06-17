/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author renato
 */
public class EntintyManagerObjectFactory {
    public static EntityManager getEM() {
        EntityManagerFactory emf = EntityManagerFactorySingleton.getEMF();
        return emf.createEntityManager();
    }
}
