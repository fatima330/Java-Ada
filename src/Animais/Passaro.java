package Animais;

public class Passaro extends Animal{

    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso, int i){
        super(nome, cor, peso);
    }

    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }
}


