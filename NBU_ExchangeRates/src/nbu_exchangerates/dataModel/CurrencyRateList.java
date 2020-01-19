package nbu_exchangerates.dataModel;

import java.util.*;
import org.json.*;

public class CurrencyRateList {

    ArrayList<CurrencyRate> __list = new ArrayList();

    public CurrencyRateList() {
    }

    public CurrencyRateList fromJSON(String json) {
        __list.clear();
        JSONArray parser = new JSONArray(json);
        for (int i = 0; i < parser.length(); i++) {
            __list.add(new CurrencyRate().fromJSON(parser.getJSONObject(i).toString()));
        }
        return this;
    }

    public String toJSON() {
        String result = "";
        result = __list.stream().map((cr) -> cr.toJSON()).reduce(result, String::concat);
        return result;
    }

    public static Object[] getFieldsName() {
        return CurrencyRate.getFieldsName();
    }

    public Object[][] getFieldsValue() {
        Object[][] tmp = new Object[__list.size()][];
        for (int i = 0; i < __list.size(); i++) {
            tmp[i] = __list.get(i).getFieldsValue();
        }
        return tmp;
    }
}
