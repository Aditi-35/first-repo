package com.aditi.librarymanagementsystem;

public class Author {
    private String authorName;
    private String biography;
    private int noOfBooksPublished;

    public Author(String authorName, String biography, int noOfBooksPublished){
        this.authorName=authorName;
        this.biography=biography;
        this.noOfBooksPublished=noOfBooksPublished;
    }

    public String getBiography() {
        return biography;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getNoOfBooksPublished() {
        return noOfBooksPublished;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setNoOfBooksPublished(int noOfBooksPublished) {
        this.noOfBooksPublished = noOfBooksPublished;
    }

    public String getAuthorDetails(){
        return authorName+","+biography+","+noOfBooksPublished;
    }
}
