package com.company;

public class Aluno extends Pessoa implements ControllerAluno{
    private int matricula;
    private String curso;
    private boolean statusMatricula;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.setMatricula(matricula);
        this.setCurso(curso);
        this.setStatusMatricula(true);
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(boolean statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    @Override
    public void cancelarMatricula() {
        if(this.isStatusMatricula() == true){
            this.setStatusMatricula(false);
            System.out.println("Matricula Cancelada");
        }
        else{
            System.out.println("Não foi possível realizar o cancelamento da matricula");
        }
    }
}
