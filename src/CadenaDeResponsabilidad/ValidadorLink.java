package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;

public class ValidadorLink implements Validador{
    private Validador siguiente;
    
    @Override
    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean validar(JTextField campo) throws Exception {
        // Verificar que el texto contenga al menos un punto
        if (!campo.getText().contains(".")) {
            throw new Exception("El campo no contiene un link válido.");
        }
        // Pasar al siguiente validador si existe
        if (siguiente != null) {
            return siguiente.validar(campo);
        }
        return true;
    }
    
}
