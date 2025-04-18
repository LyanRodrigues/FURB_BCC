package classes;

import java.util.ArrayList;

public class Turma {

    // Atributos
    private String disciplina;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Turno turno;

    // Getters e Setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
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

    // Adiciona um aluno à turma
    public void incluirAluno(Aluno aluno) {
        if (alunos == null) {
            alunos = new ArrayList<>();
        }
        alunos.add(aluno);
    }

    // Remove um aluno da turma
    public void removerAluno(Aluno aluno) {
        if (alunos != null) {
            alunos.remove(aluno);
        }
    }

    // Exibe o aluno com a melhor nota do ENEM
    public Aluno obterAlunoMelhorNotaEnem() {
        Aluno melhorAluno;

        if (alunos != null && !alunos.isEmpty()) {
            melhorAluno = alunos.get(0);
            for (Aluno aluno : alunos) {
                if (aluno.getNotaEnem() > melhorAluno.getNotaEnem()) {
                    melhorAluno = aluno;
                }
            }
            System.out.println("Melhor aluno: " + melhorAluno.getNome() + " com nota ENEM: " + melhorAluno.getNotaEnem());
        } else {
            melhorAluno = null;
        }

        return melhorAluno;
    }
}
