package com.company;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setSchoolBuilder(new FifyA());
        School school = director.createNewSchool();
        System.out.println(school.toString());
    }
}
