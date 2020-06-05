package com.company;

public class School {
    private String teacher;
    private String student;
    private String director;

    public void setStudent(String student) {
        this.student = student;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "School{" +
                "teacher='" + teacher + '\'' +
                ", student='" + student + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
