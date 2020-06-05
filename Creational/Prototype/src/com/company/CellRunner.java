package com.company;

public class CellRunner {
    public static void main(String[] args) {
        SingleCellOrganism singleCellOrganism = new SingleCellOrganism(1,1);

        System.out.println(singleCellOrganism);

        CellFactory cellFactory = new CellFactory(singleCellOrganism);
        SingleCellOrganism cloneCell = cellFactory.cloneCell();
        System.out.println(cloneCell);

    }
}
