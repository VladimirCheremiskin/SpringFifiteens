package net.study.springfifteens;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 7/24/13
 * Time: 10:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class FifteensConsole implements Console {
    private Scanner reader = new Scanner(System.in);
    private Controller controller;

    @Override
    public int getMove() {
        System.out.println("Please, select token to move");
        return reader.nextInt();
    }

    @Override
    public void drawGameField(int[] field) {
        for (int i = 0; i < field.length; i++) {
            if ((i + 1) % 4 == 0 ) {
                System.out.print(field[i] + "\n");
            } else {
                System.out.print(field[i] + " ");
            }
        }
    }

    @Override
    public void playGame() {
        drawGameField(controller.getGameField());
        while (!controller.checkWin()) {
            drawGameField(controller.makeMove(getMove()));
        }
        System.out.println("Cogratulations, you won");
    }


    public void setController(Controller controller) {
        this.controller = controller;
    }
}
