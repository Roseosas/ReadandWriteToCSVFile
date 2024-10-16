package models;

import java.util.ArrayList;
import java.util.List;

import static enums.Gender.Female;
import static enums.Gender.Male;
import static enums.Position.Cashier;
import static enums.Position.Manager;

public class Main {
    public static void main(String[] args) {
        List<Products> newListOfProducts = new ArrayList<>();
        newListOfProducts.add(new Products("Rice", 2000.00, 50, 100));
        newListOfProducts.add(new Products("Beans",2000.00, 10, 20));
        newListOfProducts.add(new Products("Milk", 100.00, 20, 5));
        newListOfProducts.add(new Products("Cereal",200.00, 10, 10));
        newListOfProducts.add(new Products("Noodles", 10000.00, 5, 14));
        newListOfProducts.add(new Products("Sugar", 100.00, 6, 26));
        List<Staff> newListOfStaff = new ArrayList<>();
        newListOfStaff.add(new Staff("S001", "HOPE EGHOSA", 25, Male, "LAGOS", "OND", 50000, Cashier, 20));
        newListOfStaff.add(new Staff("S002", "OSAGIE HAPPINESS",21, Female, "ABUJA NIGERIA", "OLEVEL", 25000, Cashier,11));
        newListOfStaff.add(new Staff("S006", "AIYANYOR ROSEMARY OSAS", 25, Female, "ABUJA", "MASTERS", 5000000, Manager,100));

        List<Customers> newLisOfCustomers = new ArrayList<>();
        newLisOfCustomers.add(new Customers("WISDOM DANIEL", 25, Male, "LAGOS", 500.00));
        newLisOfCustomers.add(new Customers("OLESON DEBORAH", 30, Female, "ABUJA", 1000.00));
        newLisOfCustomers.add(new Customers("DAVID EMMANUEL", 35, Male, "CROSS RIVER", 20000.00));

    }
    }