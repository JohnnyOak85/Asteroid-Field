package org.academiadecodigo.bootcamp.DodgeGame;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Asteroid {
    private Picture picture;
    private Rectangle hitBox;
    private Coordinates coordinates;
    private boolean moving;
    private boolean hidden;
    private int startingX;
    private int currentX;
    private int currentY;
    private Position position;

    public Asteroid(int x, int y) {
        startingX = x;
        currentX = x;
        coordinates = new Coordinates();
        coordinates.setAstStartX(startingX);
        coordinates.setAstStartY(y);
        picture = new Picture(coordinates.getAstStartX(), coordinates.getAstStartY(), "medium_asteroid.png");
        hitBox = new Rectangle(coordinates.getAstStartX(), coordinates.getAstStartY(), picture.getWidth(), picture.getHeight());
        hidden = true;
        position = new Position((int) hitBox.getX(), (int) hitBox.getY(), (int) hitBox.getWidth(), (int) hitBox.getHeight());
        //moving = false;
        toggleHidden();
    }

    public void toggleHidden() {
        hidden = !hidden;
        if (isHidden()) {
            picture.delete();
        } else if (!isHidden()) {
            picture.draw();
        }
    }

    public void moveAsteroid() {
        //toggleHidden();
        if (currentX == 0) {
            resetCoordinates(startingX);
        }
        updateCoordinates(-10);
        moving = true;

        position.setBackX(hitBox.getX());
        position.setTopY(hitBox.getY());
        position.setFrontX(hitBox.getWidth());
        position.setBottomY(hitBox.getHeight());
    }

    public void resetCoordinates(int x) {
        int y = (int) (Math.random() * 100);

        picture.translate(startingX, y);
        hitBox.translate(startingX, y);

        if (picture.getY() >= coordinates.getYLimit()) {
            picture.translate(0, -y);
            hitBox.translate(0, -y);
        }

        if (picture.getY() <= 0) {
            picture.translate(0, y);
            hitBox.translate(0, y);
        }

        position.setBackX(hitBox.getX());
        position.setTopY(hitBox.getY());
        position.setFrontX(hitBox.getWidth());
        position.setBottomY(hitBox.getHeight());

    }

    public void updateCoordinates(int x) {
        picture.translate(x, 0);
        hitBox.translate(x, 0);
        currentX = picture.getX();
        currentY = picture.getY();

        position.setBackX(hitBox.getX());
        position.setTopY(hitBox.getY());
        position.setFrontX(hitBox.getWidth());
        position.setBottomY(hitBox.getHeight());
    }

    public boolean isMoving() {
        return coordinates.getX() != startingX;
    }

    public boolean isHidden() {
        return hidden;
    }

    public int getX() {
        return currentX;
    }

    public int getY() {
        return currentY;
    }

    public Position getPosition() {
        return position;
    }

    public Rectangle getHitBox() {
        return hitBox;
    }
}
