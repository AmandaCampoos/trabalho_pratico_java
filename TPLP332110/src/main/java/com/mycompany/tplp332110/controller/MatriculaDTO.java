/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tplp332110.controller;

/**
 *
 * @author amand
 */
public class MatriculaDTO {
     private Long alunoId;
    private Long disciplinaId;
    private String dataMatricula;
    private Double notaFinal;

    public MatriculaDTO(Long alunoId, Long disciplinaId, String dataMatricula, Double notaFinal) {
        this.alunoId = alunoId;
        this.disciplinaId = disciplinaId;
        this.dataMatricula = dataMatricula;
        this.notaFinal = notaFinal;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(Long disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
}
