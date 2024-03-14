import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk","dairy");
        groceryArray[1] = new GroceryItem("rice","grocery",5);
        groceryArray[2] = new GroceryItem("water","grocery",1);
        System.out.println(Arrays.toString(groceryArray));


        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Butter","Grocery"));
        groceryItems.add(new GroceryItem("Apple","fruit"));
        groceryItems.add(2,new GroceryItem("milk","Dairy"));
        groceryItems.add(new GroceryItem("Watermelon","fruit"));
        groceryItems.forEach(System.out::println);
        groceryItems.forEach(groceryItem -> System.out.println(groceryItem));
        System.out.println();
    }
}
