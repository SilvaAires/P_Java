package Projeto01_Herança;

public class Time {
    private String Nome;
    private int Criacao;
    private String Liga;
    private int QtdJogadores;
    private Jogador jogador;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCriacao() {
        return Criacao;
    }

    public void setCriacao(int Criacao) {
        this.Criacao = Criacao;
    }

    public String getLiga() {
        return Liga;
    }

    public void setLiga(String Liga) {
        this.Liga = Liga;
    }

    public int getQtdJogadores() {
        return QtdJogadores;
    }

    public void setQtdJogadores(int QtdJogadores) {
        this.QtdJogadores = QtdJogadores;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Time(String Nome, int Criacao, String Liga, int QtdJogadores, Jogador jogador) {
        this.Nome = Nome;
        this.Criacao = Criacao;
        this.Liga = Liga;
        this.QtdJogadores = QtdJogadores;
        this.jogador = jogador;
    }

    public Time() {
    }

    public String toString() {
        return "Nome = " + this.Nome + "\nCriacao = " + this.Criacao + 
                "\nLiga = " + this.Liga + "\nQtdJogadores = " + QtdJogadores + 
                "\nJogador: " + jogador ;
    }
    
}
