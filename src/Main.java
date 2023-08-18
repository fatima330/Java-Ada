import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {


        Cachorro cachorro1  = new Cachorro("Rex", "branco", 25,5.5, "nada", 5 );
        Gato gato1 = new Gato("Nina", "colorida", 2,5);
        Passaro passaro1 = new Passaro("Frajola", "azul", 0,5);

        //abaixo metodos soar de  gato cachorro e passaro seleciona o bloco e aperta ctrl barra para comentar tudo
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

    }
}
