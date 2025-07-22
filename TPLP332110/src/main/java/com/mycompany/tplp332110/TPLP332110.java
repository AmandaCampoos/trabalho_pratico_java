/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tplp332110;

import com.mycompany.tplp332110.model.Aluno;
import com.mycompany.tplp332110.model.AlunoDAO;

public class TPLP332110 {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno();
            aluno.setNome("Amanda Ximenes");
            aluno.setEmail("amanda@email.com");

            AlunoDAO dao = new AlunoDAO();
            dao.add(aluno);

            System.out.println("Aluno inserido com ID: " + aluno.getId());
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

