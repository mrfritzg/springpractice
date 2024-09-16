package springpractice.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springpractice.game.game1.GameRunner;
import springpractice.game.game1.GamingConsole;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
