package Interfaz.JFrame_Componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEditor extends DefaultCellEditor {
    private JButton button;
    private String label;
    private boolean isPushed;

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
        String mostrarBoton = (String) table.getModel().getValueAt(row, 6); // Supongamos que la columna con "Sí" o "No" es la columna 1

        if ("Si".equals(mostrarBoton)) {
            label = "Botón";
            button.setText(label);
            isPushed = true;
            return button;
        } else {
            isPushed = false;
            return null;
        }
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            // Aquí puedes agregar la lógica que se ejecutará al presionar el botón
            JOptionPane.showMessageDialog(button, "Botón presionado en la fila: " + button.getText());
        }
        isPushed = false;
        return label;
    }

    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }
}