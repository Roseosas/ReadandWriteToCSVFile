package models;

import enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Users {
    private double balance;
    private List<Products> cart;

    public Customers(String name, int age, Gender gender, String address, double balance){

        super(name, age, gender, address);
        this.balance=balance;
        this.cart=new ArrayList<>();
    }
}
