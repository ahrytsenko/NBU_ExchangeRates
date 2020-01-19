
package nbu_exchangerates.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import nbu_exchangerates.dataModel.*;

public class View  extends JFrame {
    
    protected final Model model;
    protected final JFrame me;
    
    public View(Model model) {
        this(null, model);
    }
    
    public View(String title, Model model) {
        super(title);
        this.model = model;
        me = this;
    }
    
    /**
     * Creates the application abstract general view (frame)
     * @return self for chain-calling
     */
    public View init() {
        this.setLayout(new BorderLayout(0, 0));
        this.setAutoRequestFocus(true);
        this.setLocationByPlatform(true);
        return this;
    }
    
    /**
     * Shows the application abstract general view (frame)
     */
    public void run() {
        this.pack();
        this.setVisible(true);
    }
    
}
