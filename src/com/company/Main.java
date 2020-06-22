package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Pila pila = new Pila();
	Scanner op= new Scanner(System.in);
	int  opcion;

	do {

        System.out.println("Menu de la pila");
        System.out.println("Opcion 1: ingresa elementos a la pila");
        System.out.println("Opcoin 2: Elimina elemento de la pila");
        System.out.println("Opcoin 3: Muestra los elementos de la pila");
        System.out.println("Opcoin 4: Finaliza el Programa");
        System.out.println("Ingrese una opcion: ");
        opcion= op.nextInt();

        switch (opcion){
            case 1:
                pila.push();
                break;
            case 2:
                pila.pop();
                break;
            case 3:
                pila.mostrarpila();
                break;
            case 4:
                break;

            default:
                System.out.println("Ingrese una opcion valida");


        }
    } while(opcion!=4);


    }
}
