package nbu_exchangerates.dataModel;

import java.util.*;
import org.json.*;

public class CurrencyRate {

    private int currencyID;
    private String currencyCode;
    private String currencyName;
    private double rate;
    private String exchangeDate;

    public CurrencyRate() {
    }

    public CurrencyRate(int currencyID, String currencyCode, String currencyName,
            double rate, String exchangeDate) {

        this.currencyID = currencyID;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.rate = rate;
        this.exchangeDate = exchangeDate;
    }

    public CurrencyRate fromJSON(String json) {
        JSONObject parser = new JSONObject(json);
        currencyID = parser.getInt("r030");
        currencyCode = parser.getString("cc");
        currencyName = parser.getString("txt");
        rate = parser.getDouble("rate");
        exchangeDate = parser.getString("exchangedate");
        return this;
    }

    public String toJSON() {
        return "{"
                + "\"r030\":" + currencyID + ","
                + "\"txt\":\"" + currencyName + "\","
                + "\"rate\":" + rate + ","
                + "\"cc\":\"" + currencyCode + "\","
                + "\"exchangedate\":\"" + exchangeDate + "\""
                + "}";
    }

    public static Object[] getFieldsName() {
        Object[] fieldNames = {"Currency ID", "Currency Code", "Currency Name", "Currency Rate", "Exchange Date"};
        return fieldNames;
    }

    public Object[] getFieldsValue() {
        Object[] row = new Object[5];
        row[0] = currencyID;
        row[1] = currencyCode;
        row[2] = currencyName;
        row[3] = rate;
        row[4] = exchangeDate;
        return row;
    }
}
