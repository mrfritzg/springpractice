package springpractice.game.game1;

public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("duck down");
    }

    public void left() {
        System.out.println("go back");
    }

    public void right() {
        System.out.println("go forward and accelerate");
    }
}
