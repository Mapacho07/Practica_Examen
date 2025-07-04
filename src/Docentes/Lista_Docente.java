/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docentes;

import MetodosGenericos.MetodoGenérico;
/**
 *
 * @author nazar
 */
public class Lista_Docente implements MetodoGenérico<Docente>{
    private Docente Docentes[];    

    public Lista_Docente() {
        this.Docentes = new Docente[100];
    }

      @Override
    public Docente Buscar(Object id) {
        for(int i=0;i<100;i++){
            if(String.valueOf(id).equals(Docentes[i].getCedula())){
                return Docentes[i];
            }
        }
        return null;
    }
    
    
    @Override
    public boolean Añadir(Docente t) {
        if(t==Buscar(t.getCedula()))
            return false;
        for(int i=0;i<100;i++){
            if(Docentes[i]==null){
                Docentes[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Eliminar(Docente t) {
       for(int i=0;i<100;i++){
           if(t==Docentes[i]){
               Docentes[i]=null;
               return true;
           }
       }
       return false;
    }

  
    
}
