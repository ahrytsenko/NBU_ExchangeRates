package nbu_exchangerates.dataModel;

public class Model {
    
    public String getCurrencyRate() {
        return "getCurrencyRate()";
    }

    public String getCurrencyRate(String date) {
        return "getCurrencyRate(String date)";
    }

    public String getCurrencyRate(String CurrencyID, String date) {
        return "getCurrencyRate(String CurrencyID, String date)";
    }
    
    public Object[] getTableHeader() {
        return CurrencyRate.getFieldsName();
    }
    
    public Object[][] getTableData() {
        Object[][] tableData = new Object[5][];
        
        CurrencyRate currencyRate = new CurrencyRate();
        
        tableData[0] = currencyRate.getFieldsValue();
        
        return tableData;
    }
}
