package com.company;

public class Adapter extends SeniorDeveloper implements Compilator {

    @Override
    public void cppCompilator() {
        cppCode();
    }

    @Override
    public void javaCompilator() {
        javaCode();
    }

    @Override
    public void htmlCompilator() {
        htmlCode();
    }
}
