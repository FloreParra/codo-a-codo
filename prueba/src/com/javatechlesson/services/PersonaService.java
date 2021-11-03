package com.javatechlesson.services;

import com.javatechlesson.model.Persona;

public class PersonaService implements IPersona {

    @Override
    public void registrar(Persona persona) {
        // TODO Auto-generated method stub
        System.out.println(persona + " registrada");

    }

}
