package Interfaz.JFrame_Componentes;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ButtonRenderer extends DefaultTableCellRenderer {
    private JButton button;

    public ButtonRenderer() {
        button = new JButton();
        button.setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Obtener el valor de la columna que determina si se muestra el botón
        String mostrarBoton = (String) table.getModel().getValueAt(row, 6); // Supongamos que la columna con "Sí" o "No" es la columna 1

        if ("Sí".equals(mostrarBoton)) {
            button.setText("Ver");
            return button;
        } else {
            return super.getTableCellRendererComponent(table, "", isSelected, hasFocus, row, column);
        }
    }
}