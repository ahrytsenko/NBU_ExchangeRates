
package nbu_exchangerates.dataModel;

import java.util.*;

public class CurrencyRate {
    
    private HashMap<String, String> fieldsMapping;
    private int currencyID;
    private String currencyCode;
    private String currencyName;
    private double rate;
    private Date exchangeDate;
    
    public CurrencyRate() {
        fieldsMapping = new HashMap();
        fieldsMapping.put("currencyId", "r030");
        fieldsMapping.put("currencyCode", "xx");
        fieldsMapping.put("currencyName", "txt");
        fieldsMapping.put("rate", "rate");
        fieldsMapping.put("exchangeDate", "exchangedate");
    }
    
}
