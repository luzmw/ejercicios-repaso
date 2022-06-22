package ar.com.ada.oop;

import domain.Planeta;

public class App {
    public static void main (String[] args){
        /*
        En el método main se deben
instanciar dos planetas, el primero haciendo uso del constructor vacío y definiendo valores
para todos sus atributos a través de los métodos set de cada uno; el segundo instanciarlo a
través del constructor definido con todos los parámetros. Mostrar los valores de sus
atributos en pantalla. Además, se debe imprimir la densidad de
         */

        Planeta planet1 = new Planeta();
        planet1.setDiametro(2222223.21);
        planet1.setCanitdadSatelites(5;
        planet1.setMasa(3256325.23);
        planet1.setNombre("jupiter");
        planet1.setObservable(true);
        planet1.setTipoPlaneta("enano");
        planet1.setVolumen(36.25);
        planet1.setDistanciaMedia(356325);

        System.out.printf("la distancia al sol del"+planet1 +"es:" +planet1.toString()+ "y es un planeta de tipo "+ planet1.esExterior());

     //   Planeta planet2 = new Planeta("marte+",boolean false,double 32563.00, double 2563.36, "gaseoso");

    }
}
