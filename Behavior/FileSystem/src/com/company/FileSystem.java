package com.company;

public class FileSystem {
    private static FileSystem fileSystem;
    private static String name = "The name of file is: ";

    public static synchronized FileSystem getFileSystem() {
        if (fileSystem == null){
            fileSystem = new FileSystem();
        }
        return fileSystem;
    }

    private FileSystem() {

    }

    public void addName(String info ){
        name += info + '\n';
    }

    public void showName(){
        System.out.println(name);
    }






}
