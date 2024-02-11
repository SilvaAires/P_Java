package Projeto01_Herança;

public class Peessoa {
    private String Nome;
    private String CPF;
    private String Telefone;
    private int idade;
    private String nacionalidade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Peessoa(String Nome, String CPF, String Telefone, int idade, String nacionalidade) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public Peessoa() {
    }

    public String toString() {
        return "Nome = " + this.Nome + "\nCPF = " + this.CPF + "\nTelefone = " + this.Telefone + 
               "\nIdade = " + this.idade + "\nNacionalidade=" + this.nacionalidade;
    }
    
}
