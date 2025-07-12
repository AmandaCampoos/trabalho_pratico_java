/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.controller;

import com.mycompany.tplp332110.model.Disciplina;
import com.mycompany.tplp332110.model.DisciplinaDAO;
import com.mycompany.tplp332110.model.GenericDAO;

/**
 *
 * @author amand
 */
public class DisciplinaController {
    private final GenericDAO<Disciplina> disciplinaDAO;

    public DisciplinaController() {
        this.disciplinaDAO = new DisciplinaDAO();
    }

    public DisciplinaResponseDTO add(DisciplinaDTO dto) {
        DisciplinaResponseDTO response = new DisciplinaResponseDTO();
        try {
            if (dto.getNome() == null || dto.getNome().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O nome da disciplina não pode ser vazio.");
                return response;
            }

            Disciplina disciplina = new Disciplina();
            disciplina.setNome(dto.getNome());
            disciplina.setCargaHoraria(dto.getCargaHoraria());

            disciplinaDAO.add(disciplina);

            if (disciplina.getId() != null) {
                response.setId(disciplina.getId());
                response.setNome(disciplina.getNome());
                response.setCargaHoraria(disciplina.getCargaHoraria());
                response.setSucesso(true);
                response.setMensagem("Disciplina cadastrada com sucesso.");
            }

        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro: " + e.getMessage());
        }

        return response;
    }
    
}
