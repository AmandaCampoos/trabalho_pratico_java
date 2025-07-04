/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110controller;

/**
 *
 * @author amand
 */



import com.mycompany.tplp332110.model.Aluno;
import com.mycompany.tplp332110.model.GenericDAO;
import com.mycompany.tplp332110.model.AlunoDAO;

// DTO de entrada
public class AlunoDTO {
    private String nome;
    private String email;

    public AlunoDTO(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
