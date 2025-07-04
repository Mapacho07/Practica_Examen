/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docentes;
import Personas.Persona;
/**
 *
 * @author nazar
 */
public class Docente extends Persona {
    protected Persona Persona;
    public String Departamento;
     
 
    public String getDepartamento(){
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public Docente(Persona Persona, String Departamento, String Cedula, String Nombre) {
        super(Cedula, Nombre);
        this.Persona = Persona;
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Docente{" + "Persona=" + Persona + ", Departamento=" + Departamento + '}';
    }
    
    
    
}
