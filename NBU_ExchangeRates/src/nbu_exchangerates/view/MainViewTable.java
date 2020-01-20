package nbu_exchangerates.view;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class MainViewTable extends ScrolledTable {

    public MainViewTable(Object[][] tableData, Object[] tableHeader) {
        super();
        tblModel.setDataVector(tableData, tableHeader);
        tblScrollPane.setPreferredSize(new Dimension(800, 480));
        tblScrollPane.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "  NBU currency exchange rates ",
                TitledBorder.CENTER, TitledBorder.TOP));
    }

}
