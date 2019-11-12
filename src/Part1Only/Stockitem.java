package Part1Only;

public class Stockitem {
    // Declare class self variables
    private String fixedStockCode;
    int quantity;
    double price;

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

    public String getStockName() {
        String unknown = "Unknown Stock Name";
        return unknown;
    }

    public String getStockDescription() {
        String unknown = "Unknown Stock Description";
        return unknown;
    }


    public void addStock(int addedQuantity) {

        if (quantity + addStock < 1) {
            System.out.println("Stock value cannot be less than one");
        }
        else if (quantity + addstock > 100) {
            System.out.println("Stock value cannot exceed 100");
        }
        else {
            quantity += addStock;
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



}
