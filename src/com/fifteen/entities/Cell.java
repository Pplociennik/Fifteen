package com.fifteen.entities;

public class Cell {

    private int x, y;
    private int value;
    private boolean isBlank;

    public Cell(int x, int y, int value, boolean isBlank) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.isBlank = isBlank;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBlank() {
        return isBlank;
    }

    public void setBlank(boolean blank) {
        this.isBlank = blank;
    }
}
