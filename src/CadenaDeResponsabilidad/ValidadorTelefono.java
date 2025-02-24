package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;

public class ValidadorTelefono implements Validador{
    private Validador siguiente;
    
    @Override
    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean validar(JTextField campo) throws Exception {
        String telefono = campo.getText();

        // Validar longitud
        if (telefono.length() != 9) {
            throw new Exception("El campo debe tener exactamente 9 dígitos.");
        }

        // Validar que comience con 9
        if (!telefono.startsWith("9")) {
            throw new Exception("El campo debe comenzar con el número 9.");
        }

        // Validar que solo contenga números
        if (!telefono.matches("\\d+")) {
            throw new Exception("El campo ebe contener solo números.");
        }

        // Pasar al siguiente validador si existe
        if (siguiente != null) {
            return siguiente.validar(campo);
        }

        return true;
    }
    
}
