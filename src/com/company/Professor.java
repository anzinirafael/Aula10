package com.company;

public class Professor extends Pessoa implements ControllerProfessor{
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void receberAumento(float aumento) {
        this.setSalario(getSalario() + aumento);
    }
}
