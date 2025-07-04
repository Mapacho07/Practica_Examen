/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MetodosGenericos;

/**
 *
 * @author duvan
 */
public interface MetodoGenérico <T> {
    public boolean Añadir (T t);
    public boolean Eliminar (T t);
    public T Buscar(Object id);
}
