package Part3Only;

public class Lights extends StockItem {
    double brightness;
    public Lights(String stockCode, int quantity, double price, double brightness) {
        super(stockCode, quantity, price);
        this.brightness = brightness;
    }

    public String getStockName() {
        return "Car Lights";
    }

    public String getStockDescription() {
        return "Lights for a car";
    }

    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString;
    }
}
