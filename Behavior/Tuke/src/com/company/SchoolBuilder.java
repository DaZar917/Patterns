package com.company;

public abstract class SchoolBuilder{
    School school;

    void create(){
        school = new School();
    }

    abstract void buildTeacher();
    abstract void buildStudent();
    abstract void buildDirector();

    public School getSchool() {
        return school;
    }
}
