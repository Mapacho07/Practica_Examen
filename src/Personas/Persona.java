/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author duvan
 */
public class Persona {
    protected String Cedula;
    protected String Nombre;

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public Persona(String Cedula, String Nombre) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + '}';
    }
    
    
}
