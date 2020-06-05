package com.company;

public class Director {
    SchoolBuilder schoolBuilder;

    public void setSchoolBuilder(SchoolBuilder schoolBuilder) {
        this.schoolBuilder = schoolBuilder;
    }


    public School createNewSchool(){
        schoolBuilder.create();
        schoolBuilder.buildDirector();
        schoolBuilder.buildStudent();
        schoolBuilder.buildTeacher();

        School school = schoolBuilder.getSchool();

        return school;
    }
}
