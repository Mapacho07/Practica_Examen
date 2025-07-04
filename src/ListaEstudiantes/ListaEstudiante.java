/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEstudiantes;

import Estudiantes.Estudiante;
import MetodosGenericos.MetodoGenérico;
/**
 *
 * @author duvan
 */
public class ListaEstudiante implements MetodoGenérico<Estudiante> {
    private Estudiante Estudiantes[];

    public ListaEstudiante() {
        this.Estudiantes = new Estudiante[150];
    }

    @Override
    public boolean Añadir(Estudiante t) {
        if (t==Buscar(t.getCedula()))
            return false;
        for(int i=0;i<150;i++){
            if(Estudiantes[i]==null){
                Estudiantes[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Eliminar(Estudiante t) {
        for(int i=0;i<150;i++){
            if(Estudiantes[i]==t){
                Estudiantes[i]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Estudiante Buscar(Object id) {
        for(int i=0;i<100;i++){
            if (String.valueOf(id).equals(Estudiantes[i].getCedula())){
                return Estudiantes[i];
            }
        }
        return null;
    }
}
