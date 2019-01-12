package com.fifteen.controllers;

import com.fifteen.entities.Board;
import com.fifteen.views.BoardConsoleView;

public class BoardController {

    Board boardModel;
    BoardConsoleView boardView;

    public BoardController(int size, int[] cellsValues) {
        this.boardModel = new Board(size, cellsValues);
        this.boardView = new BoardConsoleView(this.boardModel);
    }

    public void show() {
        this.boardView.showBoard();
    }

    private int countInversions() {
        int inv_count = 0;
        for (int i = 0; i < this.boardModel.getWidth() * this.boardModel.getWidth() - 1; i++) {
            for (int j = i + 1; j < this.boardModel.getWidth() * this.boardModel.getWidth(); j++) {
                if (this.boardModel.getOneDimensionValuesArrayElement(i) != 0 && this.boardModel.getOneDimensionValuesArrayElement(j) != 0 && this.boardModel.getOneDimensionValuesArrayElement(i) > this.boardModel.getOneDimensionValuesArrayElement(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    public boolean checkIfSolvable() {
        // firts condition: if width is odd then puzzle instance is solvable if number of inversions is even
        if (this.boardModel.getWidth() % 2 != 0) {if (this.countInversions() % 2 == 0) {return  true;}
                                                else {return false;}}
        /* second condition: if width is even, puzzle instance is solvable if:
            - the blank is on an even row counting from the bottom (second-last, fourth-last, etc.) and number of inversions is odd.
            - the blank is on an odd row counting from the bottom (last, third-last, fifth-last, etc.) and number of inversions is even.
         */
        else if (this.boardModel.getWidth() % 2 == 0) {
            if (((this.boardModel.getHeight() - this.boardModel.getBlank().getY()) % 2 == 0) && (this.countInversions() % 2 != 0)) {
                return true;
            } else if (((this.boardModel.getHeight() - this.boardModel.getBlank().getY()) % 2 != 0) && (this.countInversions() % 2 == 0)) {
                return true;
            }
        }
        else {return false;}
        return false;

    }

    public void printSolvation() {
        boardView.showCheckingResult(this.checkIfSolvable());
    }
}
