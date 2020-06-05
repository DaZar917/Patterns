package com.company;

public class File implements Copyable{
    private int size;
    private String name;
    private String source;

    public File(int size, String name, String source) {
        this.size = size;
        this.name = name;
        this.source = source;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public Object copy() {
        File file = new File(size,name,source);
        return file;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
