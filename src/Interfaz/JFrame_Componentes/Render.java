
package Interfaz.JFrame_Componentes;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Render extends JButton implements TableCellRenderer {

    public Render() {
        setText("Ver"); // Texto del botón
        setOpaque(true); // Para que se vea correctamente en la tabla
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this; // Retorna el botón como componente de la celda
    }
}

