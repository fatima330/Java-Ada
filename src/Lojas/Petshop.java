package Lojas;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;

public class Petshop {

    public void darBanho(Animal animal){

        animal.setEstadoDeEspirito("limpo");
    }

    public void tosar(Cachorro cachorro){

        cachorro.setEstadoDeEspirito("tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("com saudades");
    }

}
