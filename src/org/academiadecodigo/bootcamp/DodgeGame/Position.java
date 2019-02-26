package org.academiadecodigo.bootcamp.DodgeGame;

public class Position {
    private int backX;
    private int topY;
    private int frontX;
    private int bottomY;

    public Position(int backX, int topY, int frontX, int bottomY) {
        this.backX = backX;
        this.topY = topY;
        this.frontX = frontX + backX;
        this.bottomY = bottomY + topY;
    }

    public void setBackX(int topX) {
        this.backX = topX;
    }

    public void setTopY(int topY) {
        this.topY = topY;
    }

    public void setFrontX(int bottomX) {
        this.frontX = bottomX;
    }

    public void setBottomY(int bottomY) {
        this.bottomY = bottomY;
    }

    public int getFrontX() {
        return frontX;
    }

    public int getBottomY() {
        return bottomY;
    }

    public int getBackX() {
        return backX;
    }

    public int getTopY() {
        return topY;
    }

    public boolean equals(Position p) {
        if (this.frontX == p.backX || this.topY == p.bottomY || this.bottomY == p.topY) {
            return true;
        }
        return false;
    }
}
