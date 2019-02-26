package org.academiadecodigo.bootcamp.DodgeGame;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {
    private Picture picture;
    private Rectangle hitBox;
    private int currentX;
    private int currentY;
    private Position position;

    public void drawPlayer() {
        picture = new Picture(20, 400, "spaceship.png");
        hitBox = new Rectangle(20, 400, picture.getWidth(), picture.getHeight());
        picture.draw();
        position = new Position(hitBox.getX(), hitBox.getY(), hitBox.getWidth(), hitBox.getHeight());
    }

    public void moveUp() {
        if (picture.getY() != 20) {
            picture.translate(0, -10);
            hitBox. translate(0, -10);
        }

        position.setTopY(hitBox.getY());
        position.setBottomY(hitBox.getHeight());
    }

    public void moveDown() {
        if (picture.getY() != 780) {
            picture.translate(0, 10);
            hitBox.translate(0,10);
        }
        position.setTopY(hitBox.getY());
        position.setBottomY(hitBox.getHeight());

        currentY = picture.getY();
    }

    public void moveLeft() {
        if (picture.getX() != 20) {
            picture.translate(-20, 0);
            hitBox.translate(-20, 0);
        }
        position.setBackX(hitBox.getX());
        position.setFrontX(hitBox.getWidth());
        currentX = picture.getX();
    }

    public void moveRight() {
        if (picture.getX() != 1000) {
            picture.translate(40, 0);
            hitBox.translate(40, 0);
        }
        position.setBackX(hitBox.getX());
        position.setFrontX(hitBox.getWidth());
        currentX = picture.getX();
    }

    public void kill() {
        picture.delete();
    }

    public Position getPosition() {
        return position;
    }
}