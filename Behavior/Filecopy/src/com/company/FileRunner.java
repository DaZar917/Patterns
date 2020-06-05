package com.company;

public class FileRunner {

    public static void main(String[] args) {
        File file = new File(1, "File","/Desktop/OOP/source");
        CopyFactory copyFactory = new CopyFactory(file);
        File file1 = copyFactory.cloneFile();
        System.out.println(file);
        System.out.println(file1);
    }
}

