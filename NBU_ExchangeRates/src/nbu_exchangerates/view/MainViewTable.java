package nbu_exchangerates.view;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class MainViewTable {

    private final JTable table;
    private final JScrollPane tblScrollPane;
    private final DefaultTableModel tblModel;

    public MainViewTable(Object[][] tableData, Object[] tableHeader) {
        tblModel = new DefaultTableModel(0, 0);
        table = new JTable();
        tblScrollPane = new JScrollPane(table);
        tblModel.setDataVector(tableData, tableHeader);
        table.setModel(tblModel);
        tblScrollPane.setPreferredSize(new Dimension(800, 480));
        tblScrollPane.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "  NBU currency exchange rates ",
                TitledBorder.CENTER, TitledBorder.TOP));
        tblScrollPane.setWheelScrollingEnabled(true);
    }

    public JComponent getTable() {
        return tblScrollPane;
    }

}
