package nbu_exchangerates.dataModel;

import java.util.*;

public class CurrencyRate {

    private int currencyID;
    private String currencyCode;
    private String currencyName;
    private double rate;
    private Date exchangeDate;

    public CurrencyRate() {
    }

    public CurrencyRate(int currencyID, String currencyCode, String currencyName,
            double rate, Date exchangeDate) {

        this.currencyID = currencyID;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.rate = rate;
        this.exchangeDate = exchangeDate;
    }

    public CurrencyRate fromJSON(String json) {
        return this;
    }

    public String toJSON() {
        return "";
    }
}
