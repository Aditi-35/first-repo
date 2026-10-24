package com.aditi.librarymanagementsystem;

public class Books extends LibraryItems{
    private Author author;

    public Books(String itemID, String title,Author author){
        super(itemID,title);
        this.author=author;
    }

    public String getAuthor() {
        return author.getAuthorName();
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Author: "+this.author.getAuthorName());
    }
    public String toString(){
        return "Title: "+this.getTitle()+",ID: "+this.getItemID() +", Author: "+this.author.getAuthorName();
    }
}
