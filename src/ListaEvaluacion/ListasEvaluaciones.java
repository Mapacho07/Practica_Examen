/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEvaluacion;

import Evaluacion.Evaluaciones;
import MetodosGenericos.MetodoGenérico;
/**
 *
 * @author duvan
 */
public class ListasEvaluaciones implements MetodoGenérico<Evaluaciones> {
    private Evaluaciones Evaluacioness[];

    public ListasEvaluaciones() {
        this.Evaluacioness = new Evaluaciones[150];
    }
    
    @Override
    public boolean Añadir(Evaluaciones t) {
        if(t==Buscar(t.getIdevaluacion()))
            return false;
        for(int i=0;i<150;i++){
            if(Evaluacioness[i]==null){
                Evaluacioness[i]=t;
            }
        }
        return false;
    }

    @Override
    public boolean Eliminar(Evaluaciones t) {
        for(int i=0;i<150;i++){
            if(Evaluacioness[i]==t){
                Evaluacioness[i]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Evaluaciones Buscar(Object id) {
        for(int i=0;i<150;i++){
            if(String.valueOf(id).equals(Evaluacioness[i].getIdevaluacion())){
                return Evaluacioness[i];
            }
        }
        return null;
    }
    
    
}
