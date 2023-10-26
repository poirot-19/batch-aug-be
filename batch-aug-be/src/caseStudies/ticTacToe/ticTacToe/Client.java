package caseStudies.ticTacToe;

import caseStudies.ticTacToe.controllers.GameController;
import caseStudies.ticTacToe.models.Bot;
import caseStudies.ticTacToe.models.BotDifficultyLevel;
import caseStudies.ticTacToe.models.Game;
import caseStudies.ticTacToe.models.GameState;
import caseStudies.ticTacToe.models.Player;
import caseStudies.ticTacToe.models.PlayerType;
import caseStudies.ticTacToe.models.Symbol;
import caseStudies.ticTacToe.strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        try {
            int dimensions = 3;
            List<Player> players = new ArrayList<>();
            players.add(new Player(1L, "AB", new Symbol('X'), PlayerType.HUMAN));
            players.add(new Bot(2L, "GPT", new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY));
            List<WinningStrategy> winningStrategies = new ArrayList<>();
            Game game = gameController.startGame(dimensions,
                    players, winningStrategies);
            System.out.println("Game has been created");

            while (gameController.checkState(game).equals(GameState.IN_PROGRESS)){
                gameController.displayBoard(game);
                gameController.makeMove(game);
            }

        } catch (Exception e){
            System.out.println("Something went wrong in creating the game " +e);
        }


    }
}
