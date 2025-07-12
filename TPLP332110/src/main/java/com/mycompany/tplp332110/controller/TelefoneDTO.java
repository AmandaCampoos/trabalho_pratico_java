/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.controller;

/**
 *
 * @author amand
 */
public class TelefoneDTO {
    private String telefone;
    private String tipo;

    public TelefoneDTO(String telefone, String tipo) {
        this.telefone = telefone;
        this.tipo = tipo;
    }
    
    
    

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
