package com.company;

public class CellFactory {
    SingleCellOrganism singleCellOrganism;

    public CellFactory(SingleCellOrganism singleCellOrganism) {
        this.singleCellOrganism = singleCellOrganism;
    }

    public void setSingleCellOrganism(SingleCellOrganism singleCellOrganism) {
        this.singleCellOrganism = singleCellOrganism;
    }

    SingleCellOrganism cloneCell(){
        return (SingleCellOrganism) singleCellOrganism.split();
    }
}
