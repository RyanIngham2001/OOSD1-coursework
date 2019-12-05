package Part3Only;

import java.util.Scanner;
import java.util.Arrays;

public class UserInterface {

/* TODO : FINISH SWITCH
          FINISH CUSTOM CLASSES
*/

    public static void printItemList(StockItem[] items, int freePointer) {
        for (int i = 0; i < freePointer; i++) {
            System.out.println(items[i].getStockName() + " , " + items[i].getFixedStockCode());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        // list of items in stock. Defined as type <Object> because different classes can be held in the same list (all derive from Object)
        int listSize = 10;
        Object[] items = new Object[listSize];
        int freePointer = 0;

        while (!quit) {
            // get user input
            System.out.println("OPTIONS: \n1. New NavSys \n2. New Engine \n3. New Light \n4. New Tyre \n5. New Generic Item \n6. Edit Item \n0. Quit programme");
            int option = input.nextInt();

            switch (option) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    if (freePointer > 0) {
                        System.out.println("List is full. Please choose a different option.");
                        break;
                    }
                    System.out.println("Input stockCode, quantity, price separately in that order: ");
                    String stockCode = input.next();
                    int quantity = input.nextInt();
                    double price = input.nextDouble();
                    NavSys tempItem = new NavSys(stockCode, quantity, price);
                    items[freePointer] = tempItem;
                    freePointer++;
                    break;

                case 2:
                    if (freePointer > 0) {
                        System.out.println("List is full. Please choose a different option.");
                        break;
                    }
                    System.out.println("Input stockCode, quantity, price, horsepower separately in that order: ");
                    String stockCode = input.next();
                    int quantity = input.nextInt();
                    double price = input.nextDouble();
                    int horsepower = input.nextInt();
                    Engine items[freePointer] = new Engine(stockCode, quantity, price, horsepower);
                    freePointer++;
                    break;

                case 6:
                    UserInterface.printItemList(items, freePointer);
            }
        }



    }
}
