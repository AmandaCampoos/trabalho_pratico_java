/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.controller;

import com.mycompany.tplp332110.model.Endereco;
import com.mycompany.tplp332110.model.EnderecoDAO;
import com.mycompany.tplp332110.model.GenericDAO;

/**
 *
 * @author amand
 */
public class EnderecoController {
     private final GenericDAO<Endereco> enderecoDAO;

    public EnderecoController() {
        this.enderecoDAO = new EnderecoDAO();
    }

    public EnderecoResponseDTO add(EnderecoDTO dto) {
        EnderecoResponseDTO response = new EnderecoResponseDTO();
        try {
            if (dto.getRua() == null || dto.getRua().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("A rua não pode ser vazia.");
                return response;
            }

            Endereco endereco = new Endereco();
            endereco.setRua(dto.getRua());
            endereco.setCidade(dto.getCidade());
            endereco.setEstado(dto.getEstado());
            endereco.setCep(dto.getCep());

            enderecoDAO.add(endereco);

            if (endereco.getId() != null) {
                response.setId(endereco.getId());
                response.setRua(endereco.getRua());
                response.setCidade(endereco.getCidade());
                response.setEstado(endereco.getEstado());
                response.setCep(endereco.getCep());
                response.setSucesso(true);
                response.setMensagem("Endereço cadastrado com sucesso.");
            }

        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro: " + e.getMessage());
        }

        return response;
    }
    
}
