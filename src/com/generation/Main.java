package com.generation;

import com.generation.Uber.ConductorUber;
import com.generation.Uber.ConductorUberBlack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConductorUber Javier = new ConductorUber();
        ConductorUberBlack Pedro = new ConductorUberBlack();

        System.out.println(Javier.calculatePrice(6));

        System.out.println(Pedro.calculatePrice(6));


        /*

        Ave ave = new Ave("Petirojo");
        Ave ave2 = new Ave();
        System.out.println(ave.getNombre());

         */
        /*
        ave.comunicarse();
        ave.comer();
        ave.hacerNido();

        System.out.println("-------------------");

        Perro lomito = new Perro();
        lomito.jugar();
        lomito.comer();
        */

        /*
        Animal animal = new Animal();
        animal.comer();

         */


    }
}
