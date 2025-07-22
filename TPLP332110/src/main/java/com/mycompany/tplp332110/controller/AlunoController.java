/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.controller;

import com.mycompany.tplp332110.model.Aluno;
import com.mycompany.tplp332110.model.AlunoDAO;
import com.mycompany.tplp332110.model.GenericDAO;
import com.mycompany.tplp332110.model.Telefone;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amand
 */
public class AlunoController {
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
    
    public AlunoResponseDTO remover(Long id) {
        AlunoResponseDTO response = new AlunoResponseDTO();
        try {
            Aluno aluno = alunoDAO.getByID(id);

            if (aluno == null) {
                response.setSucesso(false);
                response.setMensagem("Aluno com ID " + id + " não encontrado.");
                return response;
            }

            alunoDAO.remove(aluno);
            response.setSucesso(true);
            response.setMensagem("Aluno removido com sucesso.");
        } catch (Exception e) {
            response.setSucesso(false);
            response.setMensagem("Erro ao remover aluno: " + e.getMessage());
        }

        return response;
    }
    
    public List<AlunoResponseDTO> getAll() {
    List<AlunoResponseDTO> respostas = new ArrayList<>();
    List<Aluno> alunos = alunoDAO.getALL();

    if (alunos != null) {
        for (Aluno aluno : alunos) {
            AlunoResponseDTO response = new AlunoResponseDTO();
            response.setId(aluno.getId());
            response.setNome(aluno.getNome());
            response.setEmail(aluno.getEmail());

            if (aluno.getTelefones() != null && !aluno.getTelefones().isEmpty()) {
                response.setTelefones(new ArrayList<>());

                for (Telefone telefone : aluno.getTelefones()) {
                    TelefoneResponseDTO tdto = new TelefoneResponseDTO();
                    tdto.setId(telefone.getId());
                    tdto.setNumero(telefone.getNumero());
                    tdto.setTipo(telefone.getTipo());
                    tdto.setId(telefone.getId());
                   
                   
                }
            }

            response.setSucesso(true);
            respostas.add(response);
        }
    }

    return respostas;
}
        
    
}
        
    
   // }
    
//}
