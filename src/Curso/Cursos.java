/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Curso;
import Docentes.Docente;

/**
 *
 * @author danny
 */
public class Cursos {
    private String codigo;
    private String nombre;
    private int grupo;
    private Docente Docente;

    public Cursos(String codigo, String nombre, int grupo, Docente Docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grupo = grupo;
        this.Docente = Docente;
    }

    public Docente getDocente() {
        return Docente;
    }
    


    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public void setDocente(Docente Docente) {
        this.Docente = Docente;
    }
    
    
    
}
