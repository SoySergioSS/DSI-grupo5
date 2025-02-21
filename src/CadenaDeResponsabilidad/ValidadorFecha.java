package CadenaDeResponsabilidad;

import Interfaces.Validador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;

public class ValidadorFecha implements Validador{
    private Validador siguiente;
    
    @Override
    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean validar(JTextField campo) throws Exception {
        String fecha = campo.getText();
//        String formato = "dd/MM/yyyy";
        String formato = "yyyy-MM-dd";

        // Comprobar que la fecha cumple con el formato DD/MM/AAAA
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        dateFormat.setLenient(false); // Activa la validación estricta (por ejemplo, no acepta 32/13/2023)

        try {
            dateFormat.parse(fecha); // Intenta convertir el texto en una fecha
        } catch (ParseException e) {
            throw new Exception("El campo no tiene el formato AAAA-MM-DD o no es una fecha válida.");
        }

        // Pasar al siguiente validador si existe
        if (siguiente != null) {
            return siguiente.validar(campo);
        }

        return true;
    }
    
}
