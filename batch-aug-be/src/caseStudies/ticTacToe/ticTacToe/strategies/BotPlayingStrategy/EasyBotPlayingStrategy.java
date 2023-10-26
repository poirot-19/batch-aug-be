package caseStudies.ticTacToe.strategies.BotPlayingStrategy;

import caseStudies.ticTacToe.models.Board;
import caseStudies.ticTacToe.models.Cell;
import caseStudies.ticTacToe.models.CellState;
import caseStudies.ticTacToe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row: board.getCells()){
            for (Cell cell: row){
                if (cell.getCellState().equals(CellState.EMPTY))
                    return new Move(cell, null);
            }
        }
        return null;
    }
}
