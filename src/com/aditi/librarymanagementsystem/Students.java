package com.aditi.librarymanagementsystem;

public class Students extends Users{
    public Students(String userID, String name) {
        super(userID, name);
    }
    @Override
    public void borrow(LibraryItems item){
        if(item instanceof Books)
            super.borrow(item);
        else
            System.out.println("Students can only borrow books.");
    }
}
