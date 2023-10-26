package caseStudies.ticTacToe.controllers;

import caseStudies.ticTacToe.Exceptions.BotCountException;
import caseStudies.ticTacToe.Exceptions.PlayerCountException;
import caseStudies.ticTacToe.Exceptions.SymbolCountException;
import caseStudies.ticTacToe.models.Game;
import caseStudies.ticTacToe.models.GameState;
import caseStudies.ticTacToe.models.Player;
import caseStudies.ticTacToe.strategies.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimensions,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) throws PlayerCountException, BotCountException, SymbolCountException {

        return Game.getBuilder().setDimension(dimensions)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void undo(){

    }

    public void getWinner(){

    }
}
