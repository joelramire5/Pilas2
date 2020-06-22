package com.company;

import java.util.Scanner;

public class Pila {
    Scanner input = new Scanner(System.in);
    int pilaNumerica[]=new int[5];
    int tope=-1;

    // metodo para ingresar elementos a la pila

    public void push(){
        if (tope>= pilaNumerica.length-1){
            System.out.println("La pila esta llena");
        }
        else {
            tope+=1;
            System.out.println("Ingrese el Dato");
            pilaNumerica[tope]=input.nextInt();
        }
    }

    public void pop(){
        if(tope==-1){
            System.out.println("La posicion esta vacia");
        }
        else {
            System.out.println("Se ha eliminado un elemento de la pila");
            pilaNumerica[tope]=0;
        }
    }
public void mostrarpila(){
        for(int tope=4;tope>=0;tope--){
            System.out.println("Datos de la pila: "+pilaNumerica[tope]);
        }

}


}
