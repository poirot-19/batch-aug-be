package caseStudies.ticTacToe;

import caseStudies.ticTacToe.Exceptions.BotCountException;
import caseStudies.ticTacToe.Exceptions.PlayerCountException;
import caseStudies.ticTacToe.Exceptions.SymbolCountException;
import caseStudies.ticTacToe.controllers.GameController;
import caseStudies.ticTacToe.models.Bot;
import caseStudies.ticTacToe.models.BotDifficultyLevel;
import caseStudies.ticTacToe.models.Game;
import caseStudies.ticTacToe.models.GameState;
import caseStudies.ticTacToe.models.Player;
import caseStudies.ticTacToe.models.PlayerType;
import caseStudies.ticTacToe.models.Symbol;
import caseStudies.ticTacToe.strategies.WinningStrategy.ColumnWinningStrategy;
import caseStudies.ticTacToe.strategies.WinningStrategy.DiagonalWinningStrategy;
import caseStudies.ticTacToe.strategies.WinningStrategy.RowWinningStrategy;
import caseStudies.ticTacToe.strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws PlayerCountException, BotCountException, SymbolCountException {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        try {
            int dimensions = 3;
            List<Player> players = new ArrayList<>();
            players.add(new Player(1L, "AB", new Symbol('X'), PlayerType.HUMAN));
            players.add(new Bot(2L, "GPT", new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY));
            List<WinningStrategy> winningStrategies = new ArrayList<>();
            winningStrategies.add(new ColumnWinningStrategy());
            winningStrategies.add(new RowWinningStrategy());
            winningStrategies.add(new DiagonalWinningStrategy());

            Game game = gameController.startGame(dimensions,
                    players, winningStrategies);
            System.out.println("Game has been created");

            while (gameController.checkState(game).equals(GameState.IN_PROGRESS)){
                gameController.displayBoard(game);

                System.out.println("Do you want to do an undo (y/n)");
                String ans = scanner.next();
                if(ans.equalsIgnoreCase("y")){
                    gameController.undo(game);
                    continue;
                }

                gameController.makeMove(game);
            }

            if (gameController.checkState(game).equals(GameState.DRAW))
                System.out.println("Game has been drawn");

            if(gameController.checkState(game).equals(GameState.WIN)){
                System.out.println("Game has been won by " + gameController.getWinner(game).getName());
            }

        } catch (Exception e){
            throw e;
//            System.out.println("Something went wrong in creating the game " +e);
        }
        // break till 10:06 PM


    }
}
