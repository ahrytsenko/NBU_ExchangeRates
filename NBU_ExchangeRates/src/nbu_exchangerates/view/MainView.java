package nbu_exchangerates.view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import nbu_exchangerates.dataModel.*;

public class MainView extends View {

    private final JButton btnClose;
    private final JPanel pnlBottom;
    private final JTable table;
    private final JScrollPane tblScrollPane;
    private final DefaultTableModel tblModel;

    public MainView(Model model) {
        this(null, model);
    }

    public MainView(String title, Model model) {
        super(title, model);
        btnClose = new JButton("Close");
        pnlBottom = new JPanel();
        table = new JTable();
        tblScrollPane = new JScrollPane(table);
        tblModel = new DefaultTableModel(0, 0);
    }

    @Override
    public void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnClose.addActionListener((ActionEvent e) -> {
            me.dispose();
        });
        pnlBottom.setLayout(new BorderLayout());
        pnlBottom.add(btnClose, BorderLayout.EAST);
        this.add(pnlBottom, BorderLayout.SOUTH);

        try {
            tblModel.setDataVector(model.getTableData(), model.getTableHeader());
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        table.setModel(tblModel);
        tblScrollPane.setPreferredSize(new Dimension(800, 480));
        tblScrollPane.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "  NBU currency exchange rates ",
                TitledBorder.CENTER, TitledBorder.TOP));
        tblScrollPane.setWheelScrollingEnabled(true);
        this.add(tblScrollPane, BorderLayout.CENTER);

    }
}
