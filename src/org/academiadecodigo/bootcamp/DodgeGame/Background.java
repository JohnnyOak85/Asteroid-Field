package org.academiadecodigo.bootcamp.DodgeGame;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {
    Picture picture;
    Coordinates coordinates;

    public void drawMenu() {
        picture = new Picture(10, 10, "menu.png");
        picture.grow(-100, -100);
        picture.translate(-100, -100);
        picture.draw();

    }

    public void drawBackground() {
        coordinates = new Coordinates();
        picture = new Picture(10, 10, "background.png");
        picture.grow(-100, -100);
        picture.translate(-100, -100);
        picture.draw();
        coordinates.setXLimit(getWidth());
        coordinates.setYLimit(getHeight());
    }

    public int getWidth() {
        return picture.getWidth();
    }

    public int getHeight() {
        return picture.getHeight();
    }

}
