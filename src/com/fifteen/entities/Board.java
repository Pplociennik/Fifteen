package com.fifteen.entities;

public class Board {

    private int width;
    private int height;

    private Cell[][] boardModel;
    private int[] oneDimensionValuesArray;

    public Board(int size, int[] cellsValues) {
        this.width = this.height = size;
        this.boardModel = new Cell[size][size];
        this.oneDimensionValuesArray = cellsValues;

        int counter = 0;
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if (cellsValues[counter] == 0) {this.boardModel[i][j] = new Cell(i, j, cellsValues[counter], true); counter++;}
                else {this.boardModel[i][j] = new Cell(i, j, cellsValues[counter], false); counter++;}
            }
        }
    }

    public int[] getOneDimensionValuesArray() {
        return oneDimensionValuesArray;
    }

    public int getOneDimensionValuesArrayElement(int index) {
        return this.oneDimensionValuesArray[index];
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

    public Cell getBlank() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                if (this.boardModel[i][j].isBlank()) {return this.getBoardCell(i, j);}
            }
        }
        return null;
    }
}
