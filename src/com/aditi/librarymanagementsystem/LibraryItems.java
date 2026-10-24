package com.aditi.librarymanagementsystem;

public class LibraryItems {
    private String itemID;
    private String title;
    private boolean isAvailable;

    public LibraryItems(String itemID, String title){
        this.itemID=itemID;
        this.title=title;
        this.isAvailable=true;
    }

    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrowItem(){
        if(isAvailable){
            System.out.println(this.getTitle()+" has been borrowed successfully.");
            isAvailable=false;
        }else {
            System.out.println(this.getTitle()+" has been already borrowed by someone.");
        }
    }

    public void returnItem(){
        this.isAvailable=true;
        System.out.println(this.getTitle()+" has returned successfully.");
    }

    public void showDetails(){
        System.out.println("ID: "+this.itemID);
        System.out.println("Title: "+this.title);
        System.out.println("Available: "+(this.isAvailable? "Yes": "No"));
    }

    @Override
    public String toString() {
        return "LibraryItems: " +
                "title='" + title + '\'' +
                ", itemID='" + itemID + '\'';
    }
}
