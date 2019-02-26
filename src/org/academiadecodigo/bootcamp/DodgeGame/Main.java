package org.academiadecodigo.bootcamp.DodgeGame;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        game.init();

        while (true) {
            Thread.sleep(20);
            game.run();
        }
    }
}
