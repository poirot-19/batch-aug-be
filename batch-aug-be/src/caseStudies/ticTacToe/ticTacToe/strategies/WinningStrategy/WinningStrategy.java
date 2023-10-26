package caseStudies.ticTacToe.strategies.WinningStrategy;

import caseStudies.ticTacToe.models.Board;
import caseStudies.ticTacToe.models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
}
