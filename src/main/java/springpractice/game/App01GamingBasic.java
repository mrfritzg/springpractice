package springpractice.game;

import springpractice.game.game1.GameRunner;
import springpractice.game.game1.SuperContraGame;

public class App01GamingBasic {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame();
//        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
