package com.javatechlesson;

import java.util.Scanner;

import com.javatechlesson.model.Persona;
import com.javatechlesson.services.IPersona;
import com.javatechlesson.services.PersonaService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona pers1 = new Persona(1, "Pepe");
        IPersona personaService = new PersonaService();
        personaService.registrar(pers1);
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("Ingrese un numero");
            opc = sc.nextInt();
        } while (opc != 4);
    }
}
