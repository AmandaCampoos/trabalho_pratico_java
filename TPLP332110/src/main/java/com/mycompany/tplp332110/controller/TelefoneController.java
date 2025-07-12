package com.mycompany.tplp332110.controller;

import com.mycompany.tplp332110.model.GenericDAO;
import com.mycompany.tplp332110.model.Telefone;
import com.mycompany.tplp332110.model.TelefoneDAO;

public class TelefoneController {
    private final GenericDAO<Telefone> telefoneDAO;

    public TelefoneController() {
        this.telefoneDAO = new TelefoneDAO();
    }

    public TelefoneResponseDTO add(TelefoneDTO dto) {
        TelefoneResponseDTO response = new TelefoneResponseDTO();
        try {
            if (dto.getTelefone() == null || dto.getTelefone().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O telefone não pode ser vazio.");
                return response;
            }

            if (dto.getTipo() == null || dto.getTipo().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O tipo não pode ser vazio.");
                return response;
            }

            Telefone telefone = new Telefone();
            telefone.setNumero(dto.getTelefone());
            telefone.setTipo(dto.getTipo());

            telefoneDAO.add(telefone);

            if (telefone.getId() != null) {
                response.setId(telefone.getId());
                response.setNumero(telefone.getNumero());
                response.setTipo(telefone.getTipo());
                response.setSucesso(true);
                response.setMensagem("Telefone cadastrado com sucesso.");
            }

        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro: " + e.getMessage());
        }

        return response;
    }
}
