package Part3Only;

public class NavSys extends StockItem {

    public NavSys(String stockCode, int quantity, double price) {

        super(stockCode, quantity, price);

    }

    public String getStockName() {
        return "Navigation system";
    }

    public String getStockDescription() {
        return "GeoVision Sat Nav";
    }


    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString;
    }

}
