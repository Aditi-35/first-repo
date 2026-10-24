package com.aditi.librarymanagementsystem;

public class Magazine extends LibraryItems {
    private int issueNumber;

    public Magazine(String itemID, String title, int issueNumber) {
        super(itemID, title);
        this.issueNumber=issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Issue Number: "+this.issueNumber);
    }

    public String toString(){
        return "Title: "+this.getTitle()+" ,ID: "+this.getItemID()+" ,Issue Number: "+this.getIssueNumber();
    }
}
