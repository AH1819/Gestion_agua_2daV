package Modelo;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/**
 *
 * @author Hitler
 */
public class CeldaRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(null);
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean oddRow = (row % 2 == 1);
        Color color = new Color(18, 120, 203);

        if (oddRow) {
            setBackground(color);
            setForeground(Color.WHITE);
        } else {
            setForeground(Color.BLACK);
        }
        setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(this);
        }
        // Cambiar el color de la celda en la columna 8 si cumple alguna condición
        if (column == 8 && table.getValueAt(row, 8).equals("Tiempo excedido")) {
            setBackground(new Color(255, 30, 29));
            setForeground(Color.BLACK);
        } else if (column == 8 && table.getValueAt(row, 8).equals("Okey")) {
            setBackground(new Color(0, 241, 82));
            setForeground(Color.BLACK);
        }

        return this;
    }
}
