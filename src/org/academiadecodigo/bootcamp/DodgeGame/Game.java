package org.academiadecodigo.bootcamp.DodgeGame;

public class Game {
    private GameKeys keyboard;
    private Background background;
    private Player player;
    private Asteroid[] asteroids;

    public void init() throws InterruptedException {
        background = new Background();
        player = new Player();
        asteroids = new Asteroid[1];
        keyboard = new GameKeys(player);
        keyboard.init();

        background.drawBackground();
        player.drawPlayer();

        for (int i = 0; i < asteroids.length; i++) {
            asteroids[i] = new Asteroid(background.getWidth() - 150, Randomizer.randomize());
        }
    }

    public boolean equals(Position ship, Position asteroid) {
        if (ship.getFrontX() <= asteroid.getBackX() && ship.getBottomY() >= asteroid.getTopY() && ship.getTopY() <= asteroid.getBottomY()) {
            return true;
        }
        return false;
    }

    public void run() throws InterruptedException {

        if (true) {

            /**
             * randomize through array to select an asteroid to move
             * check if asteroid is already moving, don't move if it is
             * can only move x at a time in an interval
             * create a counter for the time an asteroid takes to get to x = 0
             * when counter reaches a certain number, release a new asteroid
             * asteroids have to have a fixed position, can't randomize
             */

            for (int i = 0; i < asteroids.length; i++) {
                asteroids[i].moveAsteroid();
            }

            if (equals(player.getPosition(), asteroids[0].getPosition())) {
                player.kill();
                System.out.println("Explosion");
                //System.exit(1);
            }
        }
    }



}