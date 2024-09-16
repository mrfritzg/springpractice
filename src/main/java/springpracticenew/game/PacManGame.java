package springpracticenew.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
    public void up() {
        System.out.println("going up");
    }

    public void down() {
        System.out.println("going down");
    }

    public void left() {
        System.out.println("going back");
    }

    public void right() {
        System.out.println("going forward");
    }
}

