package com.fifteen.game;

import com.fifteen.controllers.BoardController;

public class ApplicationFlow {

    BoardController boardController;

    public void startApplication() {
        this.boardController = new BoardController(3, new int[]{2, 3, 6, 4, 1, 0, 5, 7, 8});
        this.boardController.show();
    }
}
