abstract class LibraryItem {
    private String filename;
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

    public LibraryItem(String filename) {
        this.filename = filename;

    }
    public abstract String toFileString();
    public static LibraryItem fromFileString(String line){
        String[] parts = line.split(",");
        if (parts.length >= 4) {
            String itemType = parts[0].trim();
            String author = parts[1].trim();
            String title = parts[2].trim();
            int itemID = Integer.parseInt(parts[3].trim());
            // Create and return an instance based on the item type
            if ("Book".equals(itemType)) {
                return new Book(author, title, itemID);
            } else if ("Magazine".equals(itemType)) {
                return new Magazine(author, title, itemID);
            }
            // Add more conditions for other types if needed
        }
        // Return null for invalid or incomplete lines
        return null;
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
}
