package com.company;

public class SingleCellOrganism implements Cell {
    private int id;
    private int type;

    public SingleCellOrganism(int id, int type) {
        this.id = id;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }


    @Override
    public Object split() {
        SingleCellOrganism clone = new SingleCellOrganism(id,type);
        return clone;
    }

    @Override
    public String toString() {
        return "SingleCellOrganism{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }
}
