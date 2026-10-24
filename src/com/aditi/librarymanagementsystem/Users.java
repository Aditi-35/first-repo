package com.aditi.librarymanagementsystem;

public class Users {
    private String userID;
    private String name;
    private byte maxLimit=1;
    private LibraryItems borrowedItem;

    public Users(String userID, String name) {
        this.userID = userID;
        this.name = name;
        this.borrowedItem=null;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public byte getMaxLimit() {
        return maxLimit;
    }

    public void borrow(LibraryItems item){
        if(maxLimit==0)
            System.out.println("you cannot borrow another item. Return first.");
        else if (item.isAvailable()) {
            borrowedItem=item;
            item.borrowItem();
            maxLimit--;
        }
    }

    public void returnItem(){
        if(maxLimit==1)
            System.out.println("You had borrowed nothing.");
        else {
            maxLimit++;
            borrowedItem.returnItem();
            borrowedItem=null;
        }
    }

    public void showBorrowedItems(){
        if(maxLimit==1)
            System.out.println("Borrowed nothing.");
        else
            borrowedItem.showDetails();
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

