
package nbu_exchangerates.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
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
    
    public void init() {
        this.setLayout(new BorderLayout(0, 0));
        this.setAutoRequestFocus(true);
        this.setLocationByPlatform(true);
    }
    
    public void run() {
        this.pack();
        this.setVisible(true);
    }
    
}
