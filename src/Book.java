public class Book extends LibraryItem {
    public Book(String author, String title, int itemID) {
        super(author, title, itemID);
    }

    @Override
    public String toFileString() {
        return "Book, " + getAuthor() + ", " + getTitle() + ", " + getItemID();
    }
    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() +
            " (ID: " + getItemID() +")");
        }
}
