package nbu_exchangerates;

//import nbu_exchangerates.dataModel.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nbu_exchangerates.Views.*;

public class NBU_ExchangeRates {

    public static void main(String[] args) {
        
        MainView mainView = new MainView();
        mainView.init();
        mainView.run();
        
    }

}
