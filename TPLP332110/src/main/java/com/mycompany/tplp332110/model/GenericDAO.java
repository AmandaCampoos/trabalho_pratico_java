/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tplp332110.model;

import java.util.List;

/**
 *
 * @author renato
 */
public interface GenericDAO<T> {
    public T add(T entity);
    public T update(T entity);
    public void remove(T entity);
    public T getByID(long id);
    public List<T> getALL();
}
