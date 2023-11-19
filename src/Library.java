import java.util.List;
import java.io.*;
import java.util.ArrayList;
    public class Library extends LibraryItem {
        private final String filename;
        private final List<LibraryItem> items = new ArrayList<>();

        public Library(String filename) {
            super(filename);
            this.filename = filename;
            loadItemsFromFile();
        }

        @Override
        public String toFileString() {
            return "Book," + getAuthor() + "," + getTitle() + "," + getItemID();
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
        public void loadItemsFromFile() {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    LibraryItem newItem = LibraryItem.fromFileString(line);
                    if (newItem != null) {
                        items.add(newItem);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading from file: " + e.getMessage());
            }
        }
        public void saveItemsToFile(String filename) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (LibraryItem item : items) {
                    String fileString = item.toFileString();
                    if (fileString != null) {
                        writer.write(fileString);
                        writer.newLine();
                    }
                }
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
        //method to add items into the Library
        public void addItem(LibraryItem item){
            items.add(item);
            System.out.println("Item has been added to the library!");
        }
        @Override
        public void displayInfo() {
        }
}