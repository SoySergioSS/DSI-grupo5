package Interfaces;

import javax.swing.JTextField;

public interface Validador {
    void setSiguiente(Validador siguiente);
    boolean validar(JTextField campo) throws Exception;
}
