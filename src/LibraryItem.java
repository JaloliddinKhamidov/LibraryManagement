abstract class LibraryItem {
    private String author;
    private String title;
    private int itemID;
    boolean checkedOut = false;
    public LibraryItem(String author, String title, int itemID){
        this.author = author;
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getItemID(){
        return this.itemID;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public abstract void displayInfo();
    public abstract void getType();
}
