package com.mycompany.tplp332110.controller;

import java.util.ArrayList;

/**
 
 * @author Amanda
 */
public class AlunoResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private boolean sucesso;
    private String mensagem;

    // Construtores
    public AlunoResponseDTO() {}

    public AlunoResponseDTO(Long id, String nome, String email, boolean sucesso, String mensagem) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    void setTelefones(ArrayList<Object> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
