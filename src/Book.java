public class Book extends LibraryItem {
    private int pageCount;
    public Book(String author, String title, int itemID) {
        super(author, title, itemID);
    }
    @Override
    public void displayInfo() {
            System.out.println("Book: " + getTitle() + " by " + getAuthor() +
                    " (ID: " + getItemID() + ", Pages: " + pageCount + ")");
        }
    @Override
    public void getType() {

    }
}
