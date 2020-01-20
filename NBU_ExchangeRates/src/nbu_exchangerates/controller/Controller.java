
package nbu_exchangerates.controller;

import nbu_exchangerates.dataModel.*;
import nbu_exchangerates.view.*;

public class Controller {
    
    private final Model model;
    
    public Controller() {
        model = new Model();
    }
    
    public void runApplication() {
        new MainView("NBU Currency Rates", model).init().run();
    }
    
}
