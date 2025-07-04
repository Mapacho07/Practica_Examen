/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;
import Personas.Persona;
/**
 *
 * @author nazar
 */
public class Estudiante  extends Persona{
    public String Carrera;
    protected Persona Persona;
    
    public String getCarrera() {
        return Carrera;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public Estudiante(String Carrera, Persona Persona, String Cedula, String Nombre) {
        super(Cedula, Nombre);
        this.Carrera = Carrera;
        this.Persona = Persona;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Carrera=" + Carrera + ", Persona=" + Persona + '}';
    }
    
    
}
