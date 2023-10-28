package caseStudies.ticTacToe.strategies.WinningStrategy;

import caseStudies.ticTacToe.models.Board;
import caseStudies.ticTacToe.models.Move;
import caseStudies.ticTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{

    Map<Symbol, Integer> leftDiagonalMap = new HashMap<>();
    Map<Symbol, Integer> rightDiagonalMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(row == col){
            if(!leftDiagonalMap.containsKey(symbol))
                leftDiagonalMap.put(symbol, 0);

            leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol) + 1);
            if(leftDiagonalMap.get(symbol).equals(board.getSize()))
                return true;
        }

        if ((row + col) == (board.getSize()-1)){
            if(!rightDiagonalMap.containsKey(symbol)){
                rightDiagonalMap.put(symbol, 0);
            }

            rightDiagonalMap.put(symbol, rightDiagonalMap.get(symbol) + 1);

            if(rightDiagonalMap.get(symbol).equals(board.getSize()))
                return true;
        }

        return false;
    }

    @Override
    public void undo(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (row==col){
            leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol) - 1);
        }
        if ((row+col) == (board.getSize()-1)){
            rightDiagonalMap.put(symbol, rightDiagonalMap.get(symbol) - 1);
        }
    }
}
