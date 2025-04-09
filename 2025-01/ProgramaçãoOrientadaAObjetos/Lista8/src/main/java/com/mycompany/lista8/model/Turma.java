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

    public Turma() {
    }

    public void incluirAluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("aluno nao pode ser nulo");
        }
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("aluno nao pode ser nulo");
        }
        alunos.remove(aluno);
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        double notaEnem = 0;
        int indiceMelhorAluno = -1; // Inicializa com valor inválido

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNotaEnem() > notaEnem) {
                notaEnem = alunos.get(i).getNotaEnem();
                indiceMelhorAluno = i; // Armazena o índice do melhor aluno
            }
        }

        // Garantir que a lista não está vazia e retornar o aluno com a melhor nota
        if (indiceMelhorAluno != -1) {
            return alunos.get(indiceMelhorAluno);
        }

        return null; // Retorna null se a lista estiver vazia
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
