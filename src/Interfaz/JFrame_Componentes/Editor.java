
package Interfaz.JFrame_Componentes;

import Interfaz.JFrame_MostrarArticulo;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.DefaultCellEditor;

public class Editor extends DefaultCellEditor {
    private JButton button;
    private boolean clicked;
    private int row; // Para identificar la fila
    private JTable table; // Referencia a la tabla

    public Editor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton("Ver");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped(); // Detiene la edición para evitar bugs
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        this.row = row;
        clicked = true;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (clicked) {
            int idArticulo = (int) table.getValueAt(row, 0); // Obtiene el ID del artículo en la fila
            
            JFrame_MostrarArticulo ventana = new JFrame_MostrarArticulo();
            ventana.setidArticulo(idArticulo); 
            ventana.setVisible(true);
        }
        clicked = false;
        return "Ver"; // Mantiene el texto del botón
    }

    @Override
    public boolean stopCellEditing() {
        clicked = false;
        return super.stopCellEditing();
    }
}

