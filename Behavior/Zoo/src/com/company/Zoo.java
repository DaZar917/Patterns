package com.company;

public class Zoo {
    private String lion;
    private String elephant;
    private String monkey;

    public void setLion(String lion) {
        this.lion = lion;
    }

    public void setElephant(String elephant) {
        this.elephant = elephant;
    }

    public void setMonkey(String monkey) {
        this.monkey = monkey;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "lion='" + lion + '\'' +
                ", elephant='" + elephant + '\'' +
                ", monkey='" + monkey + '\'' +
                '}';
    }
}
