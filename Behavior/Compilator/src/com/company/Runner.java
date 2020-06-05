package com.company;

public class Runner {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.cppCompilator();
        adapter.javaCompilator();
        adapter.htmlCompilator();
    }
}
