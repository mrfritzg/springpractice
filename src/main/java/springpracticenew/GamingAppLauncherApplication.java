package springpracticenew;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springpracticenew.game.GameRunner;
import springpracticenew.game.GamingConsole;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springpracticenew.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
