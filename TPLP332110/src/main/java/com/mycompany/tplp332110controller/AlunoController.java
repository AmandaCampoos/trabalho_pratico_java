/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110controller;

import com.mycompany.tplp332110.model.Aluno;
import com.mycompany.tplp332110.model.AlunoDAO;
import com.mycompany.tplp332110.model.GenericDAO;

/**
 *
 * @author amand
 */
class AlunoController {
    private final GenericDAO<Aluno> alunoDAO;

    public AlunoController() {
        this.alunoDAO = new AlunoDAO();
    }

    public AlunoResponseDTO add(AlunoDTO dto) {
        AlunoResponseDTO response = new AlunoResponseDTO();
        try {
            if (dto.getNome() == null || dto.getNome().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O nome não pode ser vazio.");
                return response;
            }

            if (dto.getEmail() == null || dto.getEmail().trim().isEmpty()) {
                response.setSucesso(false);
                response.setMensagem("O e-mail não pode ser vazio.");
                return response;
            }

            Aluno aluno = new Aluno();
            aluno.setNome(dto.getNome());
            aluno.setEmail(dto.getEmail());

            alunoDAO.add(aluno);

            if (aluno.getId() != null) {
                response.setId(aluno.getId());
                response.setNome(aluno.getNome());
                response.setEmail(aluno.getEmail());
                response.setSucesso(true);
                response.setMensagem("Aluno cadastrado com sucesso.");
            }

        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro: " + e.getMessage());
        }

        return response;
    }
}
