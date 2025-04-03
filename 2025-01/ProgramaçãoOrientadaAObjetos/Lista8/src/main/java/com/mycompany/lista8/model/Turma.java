/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista8.model;

import java.util.ArrayList;

/**
 *
 * @author liandrar
 */
public class Turma {
    private String disciplina;
    Professor professor;
    Turno turno;
    ArrayList<Aluno> alunos;

    public Turma(String disciplina, Professor professor, Turno turno, ArrayList<Aluno> alunos) {
        setDisciplina(disciplina);
        setProfessor(professor);
        setTurno(turno);
        setAlunos(alunos);
    }
       
    public void incluirAluno(Aluno aluno){
        //to do
    }
    
    public void removerAluno(Aluno aluno){
        //to do
    }
    
    public Aluno obterAlunoMelhorNotaEnem(){
        //to do
        return null;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
}
