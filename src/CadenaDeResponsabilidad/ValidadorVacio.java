package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;

public class ValidadorVacio implements Validador{
    private Validador siguiente;

    @Override
    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean validar(JTextField campo) throws Exception {
        if (campo.getText().trim().isEmpty()) {
            throw new Exception("El campo está vacío.");
        }
        if (siguiente != null) {
            return siguiente.validar(campo);
        }
        
        //retorna verdadero si no hay más validadores
        return true;
    }
}
