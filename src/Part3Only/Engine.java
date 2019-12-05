package Part3Only;

public class Engine extends StockItem{
    private int horsepower;

    public Engine(String stockCode, int quantity, double price, int horsepower) {

        super(stockCode, quantity, price);
        this.horsepower = horsepower;
    }

    public String getStockName() {return "Engine";}

    public String getStockDescription() {return "car engine";}


}
