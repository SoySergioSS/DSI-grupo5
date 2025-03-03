package Interfaz.JFrame_Componentes;

import Main.WindowManager;
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
    private String frameDestino; // Ventana a la que redirige

    public Editor(JCheckBox checkBox, String frameDestino) {
        super(checkBox);
        this.frameDestino = frameDestino; // Asignar ventana destino
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
            int id = (int) table.getValueAt(row, 0); // Obtiene el ID del artículo en la fila
            
            WindowManager.setIdArticulo(id);
            WindowManager.setIdActividad(id);
            WindowManager.showWindow(frameDestino); // Redirige a la ventana especificada
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
