import java.util.Scanner;

/**
 * Created by Krisztian on 2017-01-10.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Grocery groceryList = new Grocery();

    public static void main(String[] args) {
        int choice;
        boolean quit = false;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }

        }


    }

    public static void printInstruction() {

        System.out.println("\n Enter:");
        System.out.println("\t0: Print instructions ");
        System.out.println("\t1: Print grocery list");
        System.out.println("\t2: Add an item");
        System.out.println("\t3: Modify an item(current item's name and new item's name)");
        System.out.println("\t4: Remove item");
        System.out.println("\t5: Search an item");
        System.out.println("\t6: Quit");

    }

    public static void addItem() {
        System.out.println("Please enter the item you wanna add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter the item's name that you wish to replace: ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter the replacement item's name: ");
        String replacement = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem,replacement);

    }

    public static void removeItem() {
        System.out.println("Enter the name of the item you want to remove: ");
        String itemToRemove=scanner.nextLine();
        groceryList.removeGroceryItem(itemToRemove);

    }
    public  static void searchItem(){
        System.out.println("Enter the item you wanna search for:");
        String item=scanner.nextLine();
        if (groceryList.searchItem(item)){
            System.out.println(item+" found in the grocery list.");
        }else{
            System.out.println("Item not found.");
        }

    }
}
