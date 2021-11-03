package com.javatechlesson.model;

/**
 * Presenta a una persona
 * 
 * @author javatechlesson
 * @version 1.0
 */
// Al poner el doble asterisco en el principio crea el java doc.
public class Persona {
    private Integer id;
    private String nombre;

    public Persona() {
    }
    // para generar un constructor se puede hacer click derecho > Source action >
    // Generate constructor (ahi se puede tmb elegir las variables a utilizar)

    /**
     * Constructor
     * 
     * @param id     id de la persona
     * @param nombre nombre de la persona
     */
    public Persona(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

}
