package com.aditi.librarymanagementsystem;

public class UserClass implements UserOperations{
    private Users[] users= new Users[20];
    int userCount=0;
    @Override
    public void registerUser(Users user){
        if(userCount<users.length){
            users[userCount++]=user;
            System.out.println("User added.");
        }
        else
            System.out.println("FULL!");
    }
    @Override
    public void removeUser(String userID){
        for(int i=0; i<userCount; i++){
            if(users[i].getUserID().equals(userID)){
                users[i]=users[--userCount];
                users[userCount]=null;
                System.out.println("User with id "+userID+" is removed.");
                return;
            }
        }
        System.out.println("User not found.");
    }
    @Override
    public void displayUser(){
        for (int i=0; i<userCount; i++){
            System.out.println(users[i].toString());
        }
    }
}
