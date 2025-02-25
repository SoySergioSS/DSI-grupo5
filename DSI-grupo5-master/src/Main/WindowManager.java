package Main;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class WindowManager {

    private static final Map<String, JFrame> windows = new HashMap<>();
    private static int idUsuario;
    private static int idAdministrador;

    public static int getIdAdministrador() {
        return idAdministrador;
    }

    public static void setIdAdministrador(int idAdministrador) {
        WindowManager.idAdministrador = idAdministrador;
    }

    public static void setIdUsuario(int id) {
        idUsuario = id;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    // Registrar una ventana con un identificador único
    public static void registerWindow(String name, JFrame window) {
        windows.put(name, window);
    }

    // Mostrar una ventana por su identificador
    public static void showWindow(String name) {
        for (JFrame window : windows.values()) {
            window.setVisible(false); // Ocultar todas las ventanas
        }
        JFrame targetWindow = windows.get(name);
        if (targetWindow != null) {
            targetWindow.setVisible(true); // Mostrar la ventana deseada
            targetWindow.toFront();  // Lleva la ventana al frente
            targetWindow.requestFocus(); // Pide el foco
            targetWindow.setLocationRelativeTo(null);
        }
    }

    // Obtener una ventana por su identificador (si necesitas interactuar con ella)
    public static JFrame getWindow(String name) {
        return windows.get(name);
    }
}
