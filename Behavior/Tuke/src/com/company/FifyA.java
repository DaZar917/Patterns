package com.company;

public class FifyA extends SchoolBuilder {


    @Override
    void buildTeacher() {
        school.setTeacher("Teacher");
    }

    @Override
    void buildStudent() {
        school.setStudent("Student");
    }

    @Override
    void buildDirector() {
        school.setDirector("Director");
    }
}
