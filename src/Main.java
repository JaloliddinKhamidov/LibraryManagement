import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addedAuthor = null;
        String addedTitle = null;
        Library library = new Library(addedAuthor, addedTitle, generateUniqueItemId());
            int choice;
            do{
                //Display menu
                System.out.println("\nLibrary Menu:");
                System.out.println("---------------");
                System.out.println("1. Add Item");
                System.out.println("2. Display Items");
                System.out.println("3. Search Item");
                System.out.println("4. Exit");
                System.out.println("---------------");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine(); //Consume the newline character
                switch(choice){
                    case 1:
                        System.out.println("To add an item, please provide the following specifications: ");
                        System.out.print("Please specify the Author: ");
                        addedAuthor = scanner.nextLine();
                        System.out.print("Please specify the Title: ");
                        addedTitle = scanner.nextLine();
                        scanner.nextLine(); // Consume the newline character
                        // Create a Book object
                        Book newBook = new Book(addedAuthor, addedTitle, generateUniqueItemId());
                        library.addItem(newBook);
                        break;
                    case 2:
                        library.displayItems();
                        break;
                    case 3:
                        System.out.print("Please provide a title: ");
                        String searchTitle = scanner.nextLine();
                        library.searchItem(searchTitle);
                        break;
                    case 4:
                        System.out.println("Bye!");
                        System.exit(choice);
                }
            }while(true);
        }
    private static int nextItemId = 0;
    // Utility method to generate unique item IDs
    public static int generateUniqueItemId(){
        return nextItemId++;
    }
}