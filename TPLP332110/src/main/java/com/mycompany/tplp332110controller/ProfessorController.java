/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110controller;

import com.mycompany.tplp332110.model.GenericDAO;
import com.mycompany.tplp332110.model.Professor;
import com.mycompany.tplp332110.model.ProfessorDAO;

/**
 *
 * @author amand
 */
class ProfessorController {
    private final GenericDAO<Professor> professorDAO;

    public ProfessorController() {
        this.professorDAO = new ProfessorDAO();
    }


  
    public ProfessorResponseDTO add(ProfessorDTO dto) {
        ProfessorResponseDTO response = new ProfessorResponseDTO();
        try {
            if (dto.getNome() == null || dto.getNome().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O nome do professor não pode ser vazio.");
                return response;
            }

            if (dto.getEmail() == null || dto.getEmail().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O e-mail do professor não pode ser vazio.");
                return response;
            }

            Professor professor = new Professor();
            professor.setNome(dto.getNome());
            professor.setEmail(dto.getEmail());

            professorDAO.add(professor);

            if (professor.getId() != null) {
                response.setId(professor.getId());
                response.setNome(professor.getNome());
                response.setEmail(professor.getEmail());
                response.setSucesso(true);
                response.setMensagem("Professor cadastrado com sucesso.");
            }

        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro: " + e.getMessage());
        }

        return response;
    }
}
