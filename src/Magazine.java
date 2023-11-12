public class Magazine extends LibraryItem{
    private int issueNumber;
    public Magazine(String author, String title, int itemID, int issueNumber) {
        super(author, title, itemID);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo(){
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() +
                " (ID: " + getItemID() + ", Issue: " + issueNumber + ")");
    }
    @Override
    public void getType(){

    }
}
