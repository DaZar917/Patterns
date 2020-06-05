package com.company;

public class Pizza {
    private String kolbasa;
    private String syr;
    private String testo;

    public void setKolbasa(String kolbasa) {
        this.kolbasa = kolbasa;
    }

    public void setSyr(String syr) {
        this.syr = syr;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "kolbasa='" + kolbasa + '\'' +
                ", syr='" + syr + '\'' +
                ", testo='" + testo + '\'' +
                '}';
    }
}
