package com.aditi.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        //Create Library Items
        Author author1= new Author("ABC","She is the author of the book \"Head First\"",12);

        Books book1=new Books("Java001","Head First Java",author1);
        Books book2=new Books("Java002","First Java",author1);

        Magazine m1=new Magazine("Mag001","AI Evolu on",10);
        Students student1 = new Students("101","Aditi");

        Library library=new Library();
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(m1);

        library.displayItems();

        library.removeItem("Mag001");

        UserClass userClass=new UserClass();
        userClass.registerUser(student1);
        userClass.displayUser();
        userClass.removeUser("101");
//        library.addBook(book1);
//        library.addBook(book2);
//
//        library.displayMagazine();
//
//        library.removeBook("Java002");
//        library.removeBook("Jaavajk");
//
//        library.displayMagazine();
//        library.addMagazine(m1);
//        library.displayMagazine();
//        library.removeMagazine("Mag001");
//        library.displayMagazine();

        //Create Users
//        Students s1=new Students("24Stu001","Payal");
//        Professors p1=new Professors("EMP001","Jenny");
//
//        //Borrow items
//        s1.borrow(book1);
//        // s1.borrow(m1);
//        p1.borrow(m1);
//
//        //Return items
//        p1.returnItem();
//        s1.returnItem();
//
//        p1.borrow(book1);
//
//        //show Borrowed items
//        s1.showBorrowedItems();
//        p1.showBorrowedItems();
    }
}
