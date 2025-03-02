package CadenaDeResponsabilidad;

import Interfaces.Validador;
import javax.swing.JTextField;

public class ValidadorCorreo implements Validador{
    private Validador siguiente;
    
    @Override
    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean validar(JTextField campo) throws Exception {
        String correo = campo.getText();

        // Validar que contiene un único @
        if (correo.chars().filter(ch -> ch == '@').count() != 1) {
            throw new Exception("El campo debe contener exactamente un '@'.");
        }

        // Dividir en parte local (antes del @) y dominio (después del @)
        String[] partes = correo.split("@");
        if (partes.length != 2 || partes[0].isEmpty() || partes[1].isEmpty()) {
            throw new Exception("El campo debe tener un formato válido (ejemplo: usuario@dominio.com).");
        }

        // Validar que la parte del dominio contiene al menos un punto
        String dominio = partes[1];
        if (!dominio.contains(".")) {
            throw new Exception("El dominio del correo debe contener al menos un punto (ejemplo: dominio.com).");
        }

        // Validar que el punto no esté al inicio o al final del dominio
        if (dominio.startsWith(".") || dominio.endsWith(".")) {
            throw new Exception("El dominio del correo no puede comenzar ni terminar con un punto.");
        }

        // Pasar al siguiente validador si existe
        if (siguiente != null) {
            return siguiente.validar(campo);
        }

        return true;
    }
    
}
