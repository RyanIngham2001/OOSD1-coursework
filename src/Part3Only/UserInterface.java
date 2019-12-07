package Part3Only;

import java.util.Scanner;
import java.util.Arrays;

public class UserInterface {

/* TODO : FINISH SWITCH
          FINISH CUSTOM CLASSES
*/



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        // list of items in stock. Defined as type <Object> because different classes can be held in the same list (all derive from Object)
        int listSize = 10;
        StockItem[] items = new StockItem[listSize];
        int freePointer = 0;


        while (!quit) {
            // get user input
            System.out.println("OPTIONS: \n1. New NavSys \n2. New Engine \n3. New Light \n4. New Seats \n5. New Generic Item \n6. Edit Item \n0. Quit programme");
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
                    NavSys tempNav = new NavSys(stockCode, quantity, price);
                    items[freePointer] = tempNav;
                    freePointer++;
                    break;

                case 2:
                    if (freePointer > 10) {
                        System.out.println("List is full. Please choose a different option.");
                        break;
                    }
                    System.out.println("Input stockCode, quantity, price, horsepower separately in that order: ");
                    String engineStockCode = input.next();
                    int engineQuantity = input.nextInt();
                    double enginePrice = input.nextDouble();
                    int engineHorsepower = input.nextInt();
                    Engine tempEngine = new Engine(engineStockCode, engineQuantity, enginePrice, engineHorsepower);
                    items[freePointer] = tempEngine;
                    freePointer++;
                    break;

                case 3:
                    if (freePointer > 10) {
                        System.out.println("List is full. Please choose a different option.");
                        break;
                    }
                    System.out.println("Input stockCode, quantity, price, brightness separately in that order: ");
                    String lightStockCode = input.next();
                    int lightQuantity = input.nextInt();
                    double lightPrice = input.nextDouble();
                    int lightBrightness = input.nextInt();
                    Lights tempLights = new Lights(lightStockCode, lightQuantity, lightPrice, lightBrightness);
                    items[freePointer] = tempLights;
                    freePointer++;
                    break;

                case 4:
                    if (freePointer > 10) {
                        System.out.println("List is full. Please choose a different option.");
                        break;
                    }
                    System.out.println("Input stockCode, quantity, price, material separately in that order: ");
                    String seatStockCode = input.next();
                    int seatQuantity = input.nextInt();
                    double seatPrice = input.nextDouble();
                    String seatMaterial = input.next();
                    Seats tempSeats = new Seats(seatStockCode, seatQuantity, seatPrice, seatMaterial);
                    items[freePointer] = tempSeats;
                    freePointer++;
                    break;

                case 5:
                    if (freePointer > 10) {
                        System.out.println("List is full. Please choose a different option.");
                        break;
                    }
                    System.out.println("Input stockCode, quantity, price in that order: ");
                    String genStockCode = input.next();
                    int genQuantity = input.nextInt();
                    double genPrice = input.nextDouble();
                    StockItem tempItem = new StockItem(genStockCode, genQuantity, genPrice);
                    items[freePointer] = tempItem;
                    freePointer++;
                    break;

                case 6:
                    System.out.println("Please select which item to edit : ");
                    for (int i = 0; i < freePointer; i++) {
                        int indexValue = i + 1;
                        System.out.println(indexValue + ". " + items[i].getStockName() + " , " + items[i].getFixedStockCode());
                    }

                    int choice = input.nextInt() - 1;

                    System.out.println(items[choice].getStockName());
                    System.out.println("Select option : \n1. Get Stock Information \n2. Add Stock \n3. Sell Stock \n4. Set Quantity \n5. Set Price");
                    int editChoice = input.nextInt();

                    switch (editChoice) {
                        case 1:
                            System.out.println(items[choice].classToString());
                            break;
                        case 2:
                            System.out.println("How much stock to add : ");
                            items[choice].addStock(input.nextInt());
                        case 3:
                            System.out.println("How much stock to sell : ");
                            items[choice].sellStock(input.nextInt());
                        case 4:
                            System.out.println("Input value to set : ");
                            items[choice].setQuantity(input.nextInt());
                        case 5:
                            System.out.println("Input value to set : ");
                            items[choice].setPrice(input.nextDouble());
                    }
            }
        }
    }
}
