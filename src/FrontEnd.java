import java.util.Scanner;

public class FrontEnd {
    public static void frontEndMethod() {
        Scanner scanner = new Scanner(System.in);
        String addedAuthor;
        String addedTitle;
        String filename = "library.txt";
        Library library = new Library(filename);
        int choice;
        do {
            //Display menu
            System.out.println("\nLibrary Menu:");
            System.out.println("---------------");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Display Items");
            System.out.println("4. Search Item");
            System.out.println("5. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    try {
                        System.out.println("To add a Book, please provide the following specifications: ");
                        System.out.print("Please specify the Author: ");
                        addedAuthor = scanner.nextLine();
                        System.out.print("Please specify the Title: ");
                        addedTitle = scanner.nextLine();
                        Book newBook = new Book(addedAuthor, addedTitle, generateUniqueItemId());
                        library.addItem(newBook);
                        library.saveItemsToFile(filename);
                    } catch (Exception e) {
                        System.out.println("Provide an understandable value!");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("To add a Magazine, please provide the following specifications: ");
                        System.out.print("Please specify the Author: ");
                        addedAuthor = scanner.nextLine();
                        System.out.print("Please specify the Title: ");
                        addedTitle = scanner.nextLine();
                        Magazine newMagazine = new Magazine(addedAuthor, addedTitle, generateUniqueItemId());
                        library.addItem(newMagazine);
                        library.saveItemsToFile(filename);
                    } catch (Exception e) {
                        System.out.println("Pay attention! Invalid Input!");
                    }
                    break;
                case 3:
                    try {
                        library.displayItems();
                    } catch (Exception e) {
                        System.out.println("Please provide a numerical value!");
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Please provide a title: ");
                        String searchTitle = scanner.nextLine();
                        library.searchItem(searchTitle);
                    } catch (Exception e) {
                        System.out.println("Invalid value! Try again!");
                    }
                    break;
                case 5:
                    System.out.println("Bye!");
                    System.exit(choice);
            }
        } while (true);
    }
    // Utility method to generate unique item IDs
    private static int nextItemId = 1;
    public static int generateUniqueItemId(){
        return nextItemId++;
    }
}
