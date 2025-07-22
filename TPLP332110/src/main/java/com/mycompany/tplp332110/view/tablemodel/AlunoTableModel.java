/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.view.tablemodel;

import com.mycompany.tplp332110.controller.AlunoController;
import com.mycompany.tplp332110.controller.AlunoResponseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author renato
 */
public class AlunoTableModel extends AbstractTableModel {
    private final String columnName[] = {"Id", "Nome", "E-mail"};
    private List<AlunoResponseDTO> alunos = new ArrayList<>();
    private final AlunoController controller;
    
    public AlunoTableModel() {
        this.controller = new AlunoController();
//        this.alunos = this.controller.getAll();  // tem que fazer o método
    }
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
            
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 -> {return alunos.get(rowIndex).getId();}
            case 1 -> {return alunos.get(rowIndex).getNome();}
            case 2 -> {return alunos.get(rowIndex).getEmail();}
            default -> {return null;}
        }
    }
    
    public AlunoResponseDTO getAlunoAt(int rowIndex) {
        return alunos.get(rowIndex);
    }
    
    public void removeRow(int rowIndex) {
        alunos.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void atualizaAluno(AlunoResponseDTO aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(aluno.getId())) {
                alunos.set(i, aluno); 
                fireTableRowsUpdated(i, i);
                return;
            }
        }
        addAluno(aluno);
    }
    
    public void addAluno(AlunoResponseDTO aluno) {
        alunos.add(aluno);
        fireTableRowsInserted(alunos.size() - 1, alunos.size() - 1);
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Integer.class;
        } else {
            return String.class;
        }
    }
}
