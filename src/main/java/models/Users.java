package models;

import enums.Gender;

public class Users {
    private String name;
    private int age;
    private Gender gender;
    private String address;

    public Users(String name, int age, Gender gender, String address){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
