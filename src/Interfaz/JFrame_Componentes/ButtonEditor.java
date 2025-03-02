package Interfaz.JFrame_Componentes;

import Main.WindowManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEditor extends DefaultCellEditor {

    private JButton button;
    private boolean isPushed;
    private JTable table;
    private int row;
    private int idActividad; // Guarda el ID correctamente

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        String mostrarBoton = (String) table.getModel().getValueAt(row, 6); // Supongamos que la columna con "Sí" o "No" es la columna 6

        this.table = table;
        this.row = row;

        if ("Si".equals(mostrarBoton)) {
            button.setText("Ver");
            isPushed = true;

            // 📌 Guarda el ID en la variable idActividad
            Object idValue = table.getValueAt(row, 0); // Asegúrate de que el ID está en la columna 0
            if (idValue instanceof Integer) {
                idActividad = (int) idValue;
            } else {
                idActividad = Integer.parseInt(idValue.toString());
            }

            return button;
        } else {
            isPushed = false;
            return null;
        }
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            // 📌 Usa la variable idActividad, que ahora sí está correctamente actualizada
            WindowManager.setIdActividad(idActividad);
            WindowManager.showWindow("frameActividadAsistencia");
        }
        isPushed = false;
        return "Ver"; // Mantiene el texto del botón
    }

    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }
}
