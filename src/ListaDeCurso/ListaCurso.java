/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDeCurso;

import MetodosGenericos.MetodoGenérico;
import Curso.Cursos;

/**
 *
 * @author danny
 */
public class ListaCurso implements MetodoGenérico<Cursos> {

    private Cursos cursos[];
    private int cont;

    public ListaCurso(int capacidad) {
        this.cursos = new Cursos[capacidad];
        cont = 0;
    }

    @Override
    public boolean Añadir(Cursos t) {
        if (cont >= cursos.length) {
            return false;
        }
        cursos[cont++] = t;
        return true;
    }

    @Override
    public boolean Eliminar(Cursos t) {
        for (int i = 0; i < cont; i++) {
            if (cursos[i] != null && cursos[i].getCodigo().equals(t.getCodigo())) {
                for (int j = i; j < cont - 1; j++) {
                    cursos[j] = cursos[j + 1];
                }
                cursos[--cont] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Cursos Buscar(Object id) {
        if (!(id instanceof String)) {
            return null;
        }
        String codigo = (String) id;
        for (int i = 0; i < cont; i++) {
            if (cursos[i] != null && cursos[i].getCodigo().equals(codigo)) {
                return cursos[i];
            }
        }
        return null;
    }

}
