import java.util.List;
import java.util.ArrayList;

public class Library extends LibraryItem {
    private int nextItemID = 1;
    private List<LibraryItem> items;

    public Library(String author, String title, int itemID) {
        super(author, title, itemID);
        items = new ArrayList<>();
    }

    //method to add items into the Library
    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println("Item has been added to the library!");
    }
    public int generateUniqueItemId(){
        return nextItemID;
    }
    //Method to display all the items in the library
    public void displayItems(){
        System.out.println("Library Items: ");
        for(LibraryItem item : items){
            item.displayInfo();
        }
    }
    //Method to search for items by title in Library
    public void searchItem(String title){
        boolean found = false;
        for (LibraryItem item : items){
            if(item.getTitle().equalsIgnoreCase(title)){
                item.displayInfo();
                found = true;
            }
        }
        if(!found){
            System.out.println("Item not found in the library, Whee!");
        }
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void getType() {

    }
}