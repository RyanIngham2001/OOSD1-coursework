package Part3Only;

public class Seats extends StockItem {
    String material;

    public Seats(String stockCode, int quantity, double price, String material) {
        super(stockCode, quantity, price);
        this.material = material;
    }

    public String getStockName() { return "Car seats";}

    public String getStockDescription() { return "Seats for a car";}

    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString;

    }
}
