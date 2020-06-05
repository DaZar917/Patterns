package com.company;

public class Animal implements Copyable
{
    private String name;
    private String family;
    private int dnk;

    public Animal(String name, String family, int dnk) {
        this.name = name;
        this.family = family;
        this.dnk = dnk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getDnk() {
        return dnk;
    }

    public void setDnk(int dnk) {
        this.dnk = dnk;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", dnk=" + dnk +
                '}';
    }


    @Override
    public Object clone() {
        return new Animal(name,family,dnk);
    }
}
