package com.company;

public class FileRunner {
    public static void main(String[] args) {
        FileSystem.getFileSystem().addName("\nFirst log");
        FileSystem.getFileSystem().addName("Second log");
        FileSystem.getFileSystem().addName("Third log");

        FileSystem.getFileSystem().showName();
    }
}
