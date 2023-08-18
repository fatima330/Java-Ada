package Animais;

public abstract class Animal {
    protected String nome;         //modificdores de acesso: protected qualquer classe filha pode acessar
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void  comer(){}

    protected void dormir(){}

    public abstract void soar();

    public void setEstadoDeEspirito(String limpo) {
    }
}
