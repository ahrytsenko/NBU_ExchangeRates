package nbu_exchangerates.dataModel;

import java.io.IOException;
import jsimplehttp.*;

public class Model {

    JSimpleHTTP http;

    {
        try {
            http = new JSimpleHTTP();
        } catch (IOException e) {
            http = null;
        }
    }

    CurrencyRateList currencyRateList = new CurrencyRateList();
    Object[] tableHeader;

    public String getCurrencyRate() throws IOException {
        
        http.setRequestURL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json", true);
        
        try {
            http.sendGET();
            tableHeader = CurrencyRateList.getFieldsName();
            if (http.sendGET() == 200) {
                return http.getResponseBody();
            }
            else {
                return rates;
            }
        }
        catch (IOException e) {
            return rates;
        }
    }

    public String getCurrencyRate(String date) {
        return "getCurrencyRate(String date)";
    }

    public String getCurrencyRate(String CurrencyID, String date) {
        return "getCurrencyRate(String CurrencyID, String date)";
    }

    public Object[] getTableHeader() {
        return tableHeader;
    }

    public Object[][] getTableData() throws IOException {
        currencyRateList.fromJSON(getCurrencyRate());
        return currencyRateList.getFieldsValue();
    }

    private final String rates  = "[\n"
            + "{ \n"
            + "\"r030\":36,\"txt\":\"Австралійський долар\",\"rate\":16.7077,\"cc\":\"AUD\",\"exchangedate\":\"20.01.2020\"\n"
            + " }\n"
            + ",{ \n"
            + "\"r030\":191,\"txt\":\"Куна\",\"rate\":3.6213,\"cc\":\"HRK\",\"exchangedate\":\"20.01.2020\"\n"
            + " }\n"
            + ",{ \n"
            + "\"r030\":203,\"txt\":\"Чеська крона\",\"rate\":1.0711,\"cc\":\"CZK\",\"exchangedate\":\"20.01.2020\"\n"
            + " }\n"
            + ",{ \n"
            + "\"r030\":840,\"txt\":\"Долар США\",\"rate\":24.2527,\"cc\":\"USD\",\"exchangedate\":\"20.01.2020\"\n"
            + " }\n"
            + ",{ \n"
            + "\"r030\":959,\"txt\":\"Золото\",\"rate\":37807.05,\"cc\":\"XAU\",\"exchangedate\":\"20.01.2020\"\n"
            + " }\n"
            + "]";
}
