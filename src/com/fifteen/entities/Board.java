package com.fifteen.entities;

public class Board {

    private int width;
    private int height;

    private Cell[][] boardModel;

    public Board(int size, int blankX, int blankY, int[] cellsValues) {
        this.width = this.height = size;
        this.boardModel = new Cell[size][size];

        int row = 0;
        int column = 0;
        for(int i = 0; i < cellsValues.length; i++) {
            if ((i + 1) % size == 0) {row += 1; column = 0;}
            else {
                if(cellsValues[i] == 0) {this.boardModel[row][column] = new Cell(row, column, 0, true);}
                else {this.boardModel[row][column] = new Cell(row, column, cellsValues[i], false);}
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cell[][] getBoardModel() {
        return boardModel;
    }

    public void setBoardModel(Cell[][] boardModel) {
        this.boardModel = boardModel;
    }

    public Cell getBoardCell(int x, int y) {
        return this.boardModel[x][y];
    }

    public void setBoardCellX(int x, int y, int valueOfX) {
        this.boardModel[x][y].setX(valueOfX);
    }

    public void setBoardCellY(int x, int y, int valueOfY) {
        this.boardModel[x][y].setY(valueOfY);
    }

    public void setBoardCellValue(int x, int y, int value) {
        this.boardModel[x][y].setValue(value);
    }


    public void setBoardCellBlank(int x, int y, boolean blankStatus) {
        this.boardModel[x][y].setBlank(blankStatus);
    }
}
