package caseStudies.ticTacToe.strategies.WinningStrategy;

import caseStudies.ticTacToe.models.Board;
import caseStudies.ticTacToe.models.Move;
import caseStudies.ticTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{

    Map<Integer, Map<Symbol, Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!counts.containsKey(row)){
            counts.put(row, new HashMap<>());
        }
        Map<Symbol, Integer> rowMap = counts.get(row);
        if (!rowMap.containsKey(symbol)){
            rowMap.put(symbol, 0);
        }
        rowMap.put(symbol, rowMap.get(symbol) + 1);
        if (rowMap.get(symbol).equals(board.getSize()))
            return true;
        return false;
    }

    @Override
    public void undo(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();
        Map<Symbol, Integer> rowMap = counts.get(row);
        rowMap.put(symbol, rowMap.get(symbol) - 1);
    }
}
