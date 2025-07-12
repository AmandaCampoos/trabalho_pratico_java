/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.controller;

import com.mycompany.tplp332110.model.GenericDAO;
import com.mycompany.tplp332110.model.Matricula;
import com.mycompany.tplp332110.model.MatriculaDAO;

/**
 *
 * @author amand
 */
public class MatriculaController {
    
private final GenericDAO<Matricula> matriculaDAO;

    public MatriculaController() {
        this.matriculaDAO = new MatriculaDAO();
    }

    public MatriculaResponseDTO add(MatriculaDTO dto) {
        MatriculaResponseDTO response = new MatriculaResponseDTO();
        try {
            Matricula matricula = new Matricula();
            matricula.setNotaFinal(dto.getNotaFinal());
            matricula.setDataMatricula(java.sql.Date.valueOf(dto.getDataMatricula()));

          
            // Aluno aluno = new AlunoDAO().getByID(dto.getAlunoId());
            // Disciplina disciplina = new DisciplinaDAO().getByID(dto.getDisciplinaId());
            // matricula.setAluno(aluno);
            // matricula.setDisciplina(disciplina);

            matriculaDAO.add(matricula);

            if (matricula.getId() != null) {
                response.setId(matricula.getId());
                response.setSucesso(true);
                response.setMensagem("Matrícula cadastrada com sucesso.");
            }
        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro: " + e.getMessage());
        }
        return response;
    }
}