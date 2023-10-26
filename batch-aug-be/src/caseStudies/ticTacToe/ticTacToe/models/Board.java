package caseStudies.ticTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int dimension){
        this.size = dimension;
        this.board = new ArrayList<>();

        for(int i=0; i< size; i++){
            board.add(new ArrayList<>());
            for (int j=0; j<size; j++){
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void displayBoard(){
        for(List<Cell> row: board){
            for(Cell cell: row){
                if (cell.getPlayer() == null)
                    System.out.print("| - |");
                else
                    System.out.print("| " + cell.getPlayer().getSymbol().getaChar() + " |");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCells() {
        return board;
    }

    public void setCells(List<List<Cell>> cells) {
        this.board = cells;
    }
}
