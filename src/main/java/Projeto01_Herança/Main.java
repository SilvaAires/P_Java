package Projeto01_Herança;

public class Main {
    public static void main(String[] args) {
        Time t = new Time();
        Jogador j = new Jogador();
        j.setCPF("054809");
        j.setIdade(1);
        j.setNacionalidade("uruguai");
        j.setNome("suarez");
        j.setPosicao("ata");
        j.setSalario(9);
        j.setTelefone("54849");
        
        t.setJogador(j);
        t.setCriacao(2000);
        t.setLiga("SerieB");
        t.setNome("Gremio");
        t.setQtdJogadores(11);
        
        System.out.println(t.toString());
    }
}
