
package nbu_exchangerates.view;

import javax.swing.*;
import javax.swing.table.*;

public class ScrolledTable {
    
    protected final JTable table;
    protected final JScrollPane tblScrollPane;
    protected final DefaultTableModel tblModel;
    
    public ScrolledTable() {
        tblModel = new DefaultTableModel(0, 0);
        table = new JTable();
        tblScrollPane = new JScrollPane(table);
        table.setModel(tblModel);
        tblScrollPane.setWheelScrollingEnabled(true);
    }

    public JComponent getTable() {
        return tblScrollPane;
    }
    
}
