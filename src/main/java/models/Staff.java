package models;

import enums.Gender;
import enums.Position;

public class Staff extends Users{

        private double salary;
        private Position position;
        private String staffID;
        private String qualification;
        private int performingRating;


    public Staff(String staffID, String name, int age, Gender gender, String address, String qualification, double salary, Position position, int performingRating){
            super(name,age,gender,address);
            this.staffID = staffID;
            this.qualification= qualification;
            this.salary = salary;
            this.position= position;
            this.performingRating= performingRating;

        }

        public  String getStaffID() { return staffID;}

        public double getSalary() {
            return salary;
        }

        public  String getQualification() {return  qualification;}
        public Position getPosition(){
            return position;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public void setPosition(enums.Position position) {
            this.position = position;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
        }

        public void setStaffID(String staffID) {
            this.staffID = staffID;
        }

        public int getPerformingRating() {
            return performingRating;
        }

        public void setPerformingRating(int performingRating) {
            this.performingRating = performingRating;
        }
    }

