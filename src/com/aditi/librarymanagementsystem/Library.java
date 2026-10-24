package com.aditi.librarymanagementsystem;

public class Library implements ItemOperations{
    private LibraryItems[] items= new LibraryItems[20];
    int itemCount=0;

    public void addItem(LibraryItems item){
        if(itemCount<items.length){
            items[itemCount++]= item;
            System.out.println("Item added: "+item);
        }
        else
            System.out.println("Library is full.");
    }
    public void removeItem(String itemID){
        for(int i=0; i<itemCount; i++){
            if(items[i].getItemID().equals(itemID)){
                items[i]=items[--itemCount];
                items[itemCount]=null;
                System.out.println("item is removed with id: "+itemID);
                return;
            }
        }
        System.out.println("Item not found.");
    }
    public void displayItems(){
        for(int i=0; i<itemCount;i++){
            System.out.println(items[i].toString());
        }
    }



//    private Books[] books = new Books[10];
//    private Magazine[] magazines = new Magazine[10];
//    int bookCount=0;
//    int magazineCount=0;
//
//    @Override
//    public void addBook(Books book){
//        if(bookCount<books.length){
//            books[bookCount++]=book;
//            System.out.println("Book added: "+book.getTitle());
//        }
//        else {
//            System.out.println("Library is full.");
//        }
//    }
//    @Override
//    public void removeBook(String itemID){
//        for(int i=0; i<bookCount;i++){
//            if(books[i].getItemID().equals(itemID)){
//                books[i]=books[--bookCount];
//                books[bookCount]=null;
//                System.out.println("Book with id "+itemID+" has been removed.");
//                return;
//            }
//        }
//            System.out.println("Book not found.");
//    }
//    @Override
//    public void displayBooks(){
//        for (int i=0; i<bookCount;i++ ){
//            System.out.println((i+1)+" "+books[i].toString());
//        }
//    }
//
//    public void addMagazine(Magazine magazine){
//        if(magazineCount<magazines.length){
//            magazines[magazineCount++]=magazine;
//            System.out.println("Magazine added: "+magazine.getTitle());
//        }
//        else {
//            System.out.println("Library is full.");
//        }
//    }
//
//    public void removeMagazine(String itemID){
//        for(int i=0; i<magazineCount;i++){
//            if(magazines[i].getItemID().equals(itemID)){
//                magazines[i]=magazines[--magazineCount];
//                magazines[magazineCount]=null;
//                System.out.println("Magazine with id "+itemID+" has been removed.");
//                return;
//            }
//        }
//        System.out.println("Book not found.");
//    }
//    public void displayMagazine(){
//        for (int i=0; i<magazineCount; i++)
//            System.out.println(magazines[i].toString());
//    }
}
