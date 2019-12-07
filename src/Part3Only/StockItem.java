package Part3Only;

public class StockItem {
    // Declare class self variables
    private String fixedStockCode;
    private int quantity;
    private double price;

    // Constructor with arguments to set variables
    public StockItem(String stockCode, int quantity, double price) {
        this.fixedStockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFixedStockCode() {
        return fixedStockCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceVAT() {
        double vat = getVat();
        double price = getPrice();

        double priceAfterVAT = price * (1 + vat);
        return priceAfterVAT;

    }

    public String getStockName() {
        String unknown = "Unknown Stock Name";
        return unknown;
    }

    public String getStockDescription() {
        String unknown = "Unknown Stock Description";
        return unknown;
    }


    public void addStock(int addedQuantity) {

        if (quantity + addedQuantity < 1) {
            System.out.println("Stock value cannot be less than one");
        }
        else if (quantity + addedQuantity > 100) {
            System.out.println("Stock value cannot exceed 100");
        }
        else {
            quantity += addedQuantity;
        }
    }

    public boolean sellStock(int soldQuantity) {
        if (quantity - soldQuantity < 1) {
            System.out.println("Cannot sell more stock than is currently available");
            return false;
        }
        else {
            quantity -= soldQuantity;
            return true;
        }
    }

    public double getVat() {
        double standardVat = 0.175;
        return standardVat;
    }

    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString;

    }



}
