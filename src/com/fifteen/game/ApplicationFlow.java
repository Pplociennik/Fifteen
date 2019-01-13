package com.fifteen.game;

import com.fifteen.controllers.BoardController;
import com.fifteen.processes.AStar;
import com.fifteen.views.ApplicationConsoleView;

public class ApplicationFlow {

    BoardController boardController;


    public void startApplication() {
        this.boardController = new BoardController(4, new int[]{12, 15, 6, 10, 4, 9, 5, 8, 14, 13, 0, 2, 1, 7, 11, 3});
        this.boardController.printSolvation();
        this.boardController.show();


        AStar aStar = new AStar(4, 4, 0, 0, 3, 2, this.boardController.getBoardModel().getBoardModel());

        aStar.display();
        aStar.process(); // Apply A* algorithm
        aStar.displayScores(); // Display Scores on grid
        aStar.displaySolution(); // Display Solution Path
    }
}
