package Animais;

public class Cachorro extends Animal{

    //atributos
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    //construtores padrao default

    //construtores adicionados, definido pelo usuario
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo){
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros ++;
    }

    //metodos

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public  String getNome(){return  this.nome;}

    public void setNome(String nome){this.nome = nome;}

    public String getCor() {return cor;}

    public void setCor(String cor) { }

    public int getAltura() {return altura;}

    public void setAltura(int altura) {this.altura = altura;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public int getTamanhoDoRabo() {return tamanhoDoRabo;}

    public void setTamanhoDoRabo(int tamanhoDoRabo) {this.tamanhoDoRabo = tamanhoDoRabo;}
    public String getEstadoDeEspirito() {return estadoDeEspirito;}



    public String pegar(){return "Bolinha";}

    public String interagir(String acao) {

        switch (acao){
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;

        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU");
    }
}


//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        }else if (acao.equals("vai dormir")){
//            this.estadoDeEspirito = "Bravo";
//        }else {
//            this.estadoDeEspirito = "neutro";
//        }
//         return estadoDeEspirito;