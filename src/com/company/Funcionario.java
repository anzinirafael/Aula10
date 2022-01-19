package com.company;

public class Funcionario extends Pessoa implements ControllerFuncionario{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setSetor(setor);
        this.setTrabalhando(trabalhando);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public void mudarTrabalho(String setor) {
        this.setSetor(setor);
        System.out.println("O trabalho foi alterado para: " + this.getSetor());
    }
}
