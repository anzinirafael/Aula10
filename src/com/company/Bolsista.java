package com.company;

public class Bolsista extends Aluno implements ControllerBolsista{
    private boolean bolsista;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, boolean bolsista) {
        super(nome, idade, sexo, matricula, curso);
        this.setBolsista(true);
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    @Override
    public void renovarBolsa() {
        if(this.isBolsista() == true){
            System.out.println("Bolsa de estudos renovada");
        }
        else{
            System.out.println("O aluno não é bolsista");
        }
    }

    @Override
    public void pagarMensalidade() {
        if(this.isBolsista() == true){
            System.out.println("Pagamento de mensalidade aceito");
        }
        else{
            System.out.println("Não foi possivel realizar o pagamento da mensalidade");
        }
    }
}
