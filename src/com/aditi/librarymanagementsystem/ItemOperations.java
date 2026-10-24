package com.aditi.librarymanagementsystem;

public interface ItemOperations {
    void addItem(LibraryItems item);
    void removeItem(String itemID);
    void displayItems();
}
