package com.company;

public class CopyFactory {
    private File file;

    public CopyFactory(File file) {
        this.file = file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File cloneFile(){
        return (File) file.copy();
    }
}

