package com.generation.animales;

public class Ave extends Animal{
    private int alas;
    private int patas;
    private boolean vuela;

    public Ave(){
        super();
    }

    public Ave(String nombre){
        super(nombre);
        System.out.println("Constructor hijo");
    }



    public void hacerNido(){
        System.out.println("Estoy haciendo un nido");
    }
    public void ponerHuevo(){
        System.out.println("Estoy poniendo un huevo");
    }

    @Override
    public void comer(){
        System.out.println("Comiendo alpiste");
    }

    @Override
    public void respirar(){
        System.out.println("Respirando por el pico");
    }
}
