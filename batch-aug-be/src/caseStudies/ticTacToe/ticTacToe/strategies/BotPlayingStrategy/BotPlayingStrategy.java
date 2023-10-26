package caseStudies.ticTacToe.strategies.BotPlayingStrategy;

import caseStudies.ticTacToe.models.Board;
import caseStudies.ticTacToe.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
