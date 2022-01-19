package com.company;

public class Tecnico extends Aluno implements ControllerTecnico{
    private boolean registroProfissional;

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
        this.setRegistroProfissional(true);
    }

    public boolean isRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public void patricar() {
        if(this.isRegistroProfissional() == true){
            System.out.println("O Profissional está autorizado a patricar sua profição");
        }
        else{
            System.out.println("O profissional não está autorizado a praticar a sua profissão");
        }
    }
}
