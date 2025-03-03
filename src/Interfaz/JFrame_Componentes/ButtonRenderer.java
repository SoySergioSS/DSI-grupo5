package Interfaz.JFrame_Componentes;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ButtonRenderer extends DefaultTableCellRenderer {
    private final JButton button;

    public ButtonRenderer() {
        button = new JButton("Ver");
        button.setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Obtener el modelo de la tabla y verificar la columna "Aceptado" (índice 6)
        Object aceptarValue = table.getModel().getValueAt(row, 6);

        // Evitar NullPointerException y comparar correctamente
        if (aceptarValue != null && aceptarValue.toString().equalsIgnoreCase("Si")) {
            return button; // Muestra el botón "Ver" si el valor es "Si"
        } else {
            return super.getTableCellRendererComponent(table, "", isSelected, hasFocus, row, column);
        }
    }
}
