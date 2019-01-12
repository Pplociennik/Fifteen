package com.fifteen.views;

import com.fifteen.entities.Board;

public class BoardConsoleView {

    Board boardModel;

    public BoardConsoleView(Board boardModel) {
        this.boardModel = boardModel;
    }

    public void showBoard() {
        for (int i = 0; i< boardModel.getWidth(); i++) {
            for (int j = 0; j < boardModel.getHeight(); j++) {
                System.out.print(boardModel.getBoardCell(i, j).getValue() + " ");
            }
            System.out.println();
        }
    }
}
