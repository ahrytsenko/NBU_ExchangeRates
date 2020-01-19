package nbu_exchangerates.view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import nbu_exchangerates.dataModel.*;

public class MainView extends View {

    private final JButton btnClose;
    private final JPanel pnlBottom;
    private MainViewTable table;

    public MainView(Model model) {
        this(null, model);
    }

    public MainView(String title, Model model) {
        super(title, model);
        btnClose = new JButton("Close");
        pnlBottom = new JPanel();
        
        try {
            table = new MainViewTable(model.getTableData(), model.getTableHeader());
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }

    @Override
    public View init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnClose.addActionListener((ActionEvent e) -> {
            me.dispose();
        });
        pnlBottom.setLayout(new BorderLayout());
        pnlBottom.add(btnClose, BorderLayout.EAST);
        this.add(pnlBottom, BorderLayout.SOUTH);

        try {
            table = new MainViewTable(model.getTableData(), model.getTableHeader());
            this.add(table.getTable(), BorderLayout.CENTER);
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return this;
    }
}
