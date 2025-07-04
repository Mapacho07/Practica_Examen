/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Evaluacion;

import Curso.Cursos;

/**
 *
 * @author danny
 */
public class Evaluaciones {
    private Cursos Curso;
    private double nota;
    private String observaciones;

    public Evaluaciones(Cursos Curso, double nota, String observaciones) {
        this.Curso = Curso;
        this.nota = nota;
        this.observaciones = observaciones;
    }

    public boolean satisfactorio() {
        return nota > 8.0;
    }
    
    
    public Cursos getCurso() {
        return Curso;
    }

    public double getNota() {
        return nota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setCurso(Cursos Curso) {
        this.Curso = Curso;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
