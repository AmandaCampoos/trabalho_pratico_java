/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.controller;

import com.mycompany.tplp332110.model.Curso;
import com.mycompany.tplp332110.model.CursoDAO;
import com.mycompany.tplp332110.model.GenericDAO;

/**
 *
 * @author amand
 */
class CursoController {
    private final GenericDAO<Curso> cursoDAO;

    public CursoController() {
        this.cursoDAO = new CursoDAO();
    }

    public CursoResponseDTO add(CursoDTO dto) {
        CursoResponseDTO response = new CursoResponseDTO();
        try {
            if (dto.getNome() == null || dto.getNome().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O nome do curso não pode ser vazio.");
                return response;
            }

            if (dto.getDescricao() == null || dto.getDescricao().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("A descrição do curso não pode ser vazia.");
                return response;
            }

            Curso curso = new Curso();
            curso.setNome(dto.getNome());
            curso.setDescricao(dto.getDescricao());

            cursoDAO.add(curso);

            if (curso.getId() != null) {
                response.setId(curso.getId());
                response.setNome(curso.getNome());
                response.setDescricao(curso.getDescricao());
                response.setSucesso(true);
                response.setMensagem("Curso cadastrado com sucesso.");
            }

        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro: " + e.getMessage());
        }

        return response;
    }
}

