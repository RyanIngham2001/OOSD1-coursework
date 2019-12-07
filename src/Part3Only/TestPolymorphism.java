package Part3Only;

public class TestPolymorphism {

    public static void itemInstance(StockItem s) {

        System.out.println("Printing item stock information: ");
        System.out.println(s.classToString());

        s.addStock(40);
        System.out.println(s.getQuantity());
        s.sellStock(10);
        System.out.println(s.getQuantity());

        System.out.println(s.getPriceVAT());
        s.setPrice(20);
        System.out.println(s.getPriceVAT());


        System.out.println("Printing item stock information: ");
        System.out.println(s.classToString());

        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        StockItem[] s = new StockItem[4];

        Engine e = new Engine("EG1", 5, 50, 200);
        Lights l = new Lights("LI2", 6, 10, 40.5);
        NavSys n = new NavSys("NS3", 2, 60);
        Seats seat = new Seats("ST4", 12, 5, "Leather");

        s[0] = e;
        s[1] = l;
        s[2] = n;
        s[3] = seat;

        for (int i = 0; i < 4; i++) {
            itemInstance(s[i]);
        }
    }
}
