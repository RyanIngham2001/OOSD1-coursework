package Part2Only;

public class NavSys extends Part2Only.StockItem {

    public NavSys(String stockCode, int quantity, double price) {

        super(stockCode, quantity, price);


    }

    public String getStockName() {
        return "Navigation system";
    }

    public String getStockDescription() {
        return "GeoVision Sat Nav";
    }

    // TODO : override toString method using super()


}
