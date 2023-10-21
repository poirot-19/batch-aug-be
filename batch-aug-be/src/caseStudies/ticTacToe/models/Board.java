package caseStudies.ticTacToe.models;

import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cells;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }
}
