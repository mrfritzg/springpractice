package springpractice.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springpractice.game.game1.GameRunner;
import springpractice.game.game1.GamingConsole;
import springpractice.game.game1.PacManGame;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacManGame();
//        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
//        return gameRunner;
    }
}
