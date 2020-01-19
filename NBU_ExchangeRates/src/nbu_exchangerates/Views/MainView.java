package nbu_exchangerates.Views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

import nbu_exchangerates.dataModel.*;

public class MainView extends JFrame {

    private final JButton btnClose;
    private final JPanel pnlBottom;
    private final JTable table;
    private final JScrollPane tblScrollPane;
    private final DefaultTableModel tblModel;
    private final JFrame me;
    private final Model model;

    public MainView() {
        super("NBU Currency Exchange Rates");
        btnClose = new JButton("Close");
        pnlBottom = new JPanel();
        table = new JTable();
        tblScrollPane = new JScrollPane(table);
        model = new Model();
        tblModel = new DefaultTableModel(0, 0);
        me = this;
    }

    public void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0, 0));
        this.setAutoRequestFocus(true);
        this.setLocationByPlatform(true);

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

    public void run() {
        this.pack();
        this.setVisible(true);
    }

}
