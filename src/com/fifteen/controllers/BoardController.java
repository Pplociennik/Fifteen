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
}
