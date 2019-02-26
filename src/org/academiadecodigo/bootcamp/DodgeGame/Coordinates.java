package org.academiadecodigo.bootcamp.DodgeGame;

public class Coordinates {
    private int x;
    private int y;
    private int xLimit;
    private int yLimit;
    private int astStartX;
    private int astStartY;

    public Coordinates() {
        //
        //
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void moveLeft(int x) {
        this.x -= x;
    }

    public void setXLimit(int x) {
        this.xLimit = x - 700;
    }

    public void setYLimit(int y) {
        this.yLimit = y;
    }

    public int getXLimit() {
        return xLimit;
    }

    public int getYLimit() {
        return yLimit;
    }

    public void setAstStartX(int x) {
        astStartX = x;
    }

    public void setAstStartY(int y) {
        astStartY = y;
    }

    public int getAstStartX() {
        return astStartX;
    }

    public int getAstStartY() {
        return astStartY;
    }
}
