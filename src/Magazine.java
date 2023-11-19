public class Magazine extends LibraryItem{
    public Magazine(String author, String title, int itemID) {
        super(author, title, itemID);
    }

    @Override
    public String toFileString() {
        return "Magazine, " + getAuthor() + ", " + getTitle() + ", " + getItemID();
    }
    @Override
    public void displayInfo(){
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() +
                " (ID: " + getItemID() +")");
    }
}
