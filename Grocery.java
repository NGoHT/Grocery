import java.util.ArrayList;

/**
 * Created by Krisztian on 2017-01-10.
 */
public class Grocery {

    private ArrayList<String> groceryList = new ArrayList<>();


    public void addGroceryItem(String item) {

        groceryList.add(item);

    }

    public void printGroceryList() {

        System.out.println("You have " + groceryList.size() + " in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }

    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }

    private void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Item " + position + ". " + item + " has been modified.");


    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }

    }

    private void removeGroceryItem(int position) {
        System.out.println(groceryList.get(position)+" has been removed.");
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);

    }
    public  boolean searchItem(String itemToFind){
        int position = findItem(itemToFind);
        if (position >=0){
            return true;
        }else
            return false ;


    }
}

