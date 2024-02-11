package Projeto01_Herança;

public class Jogador extends Peessoa {
    private double Salario;
    private String Posicao;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String Posicao) {
        this.Posicao = Posicao;
    }

    public Jogador() {
    }

    public Jogador(double Salario, String Posicao, String Nome, String CPF, String Telefone, int idade, String nacionalidade) {
        super(Nome, CPF, Telefone, idade, nacionalidade);
        this.Salario = Salario;
        this.Posicao = Posicao;
    }

    public Jogador(double Salario, String Posicao) {
        this.Salario = Salario;
        this.Posicao = Posicao;
    }

    public String toString() {
        return "\nSalario = " + this.Salario + "\nPosicao = " + this.Posicao + "\nNome = "+this.getNome()
                +"\nCpf = "+this.getCPF()+"\nNacionalidade = "+this.getNacionalidade()
                +"\nTelefone = "+this.getTelefone()+"\nIdade = "+this.getIdade();
    }
    
}
