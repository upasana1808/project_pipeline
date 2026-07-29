package com.example.model;

public class Book {
    int id;
    String title;
    String author;
    int price;
    // accepts nothing returns nothing
    public void print(){
        System.out.println(id+" "+title+" "+author);
    }
     public void print(String somedata){
        System.out.println(somedata);
    }

    public void print(int somedata){
        System.out.println(somedata);
    }
    //// accepts something returns nothing
    public void getDiscount(int num)
    {
        int discountPrice=price-(num*price/100);
        System.out.println("Dicounted price "+discountPrice);
    }
//// accepts something returns something
    public int showDiscount(int num)
    {
        return price-num*price/100;
    }
    
    
}
