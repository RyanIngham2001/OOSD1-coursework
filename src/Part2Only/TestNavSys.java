package Part2Only;

public class TestNavSys {

    public static void main(String args[]) {
        NavSys sys1 = new NavSys("NS101", 4, 50.99);
        sys1.setPrice(99.99);
        sys1.setQuantity(10);
        sys1.addStock(10);
        System.out.println(sys1.classToString());
    }
}
