package net.study.springfifteens;

import java.util.Arrays;
import java.util.Random;

public class FifteensService implements Service {
    private final int gameSize = 16;
    private int[] gameField = new int[16];
    private int[] initialField = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private int zeroPos;


    private void buildGame() {

        int[] inGameInitialField = initialField;
        Random randomGenerator = new Random();

        for (int i = 0; i < initialField.length; i++) {
            int n = randomGenerator.nextInt(gameSize - i);
            gameField[i] = inGameInitialField[n];
            inGameInitialField[n] = inGameInitialField[gameSize - 1 - i];
        }
    }

    public FifteensService() {
        buildGame();
        for (int i = 0; i < gameSize; i++) {
            if (gameField[i] == 0) {
                zeroPos = i;
            }
        }
    }

    public boolean isMovePossible(int pos) {
        pos = pos - 1;
        if (pos - 4 == zeroPos || pos + 4 == zeroPos || pos + 1 == zeroPos || pos - 1 == zeroPos) {
            return true;
        } else return false;
    }

    public int[] move(int pos) {
        int buff;
        pos = pos - 1;


        if (pos - 1 == zeroPos) {
            buff = gameField[pos];
            gameField[pos] = gameField[zeroPos];
            gameField[zeroPos] = buff;
            zeroPos = pos;
        } else if (pos + 1 == zeroPos) {
            buff = gameField[pos];
            gameField[pos] = gameField[zeroPos];
            gameField[zeroPos] = buff;
            zeroPos = pos;

        } else if (pos - 4 == zeroPos) {
            buff = gameField[pos];
            gameField[pos] = gameField[zeroPos];
            gameField[zeroPos] = buff;
            zeroPos = pos;

        } else if (pos + 4 == zeroPos) {
            buff = gameField[pos];
            gameField[pos] = gameField[zeroPos];
            gameField[zeroPos] = buff;
            zeroPos = pos;
        }
        return gameField;
    }


    public boolean isWin() {
        if (Arrays.equals(initialField, gameField)) {
            return true;
        }
        return false;
    }

    public int[] getGameField() {
        return gameField;
    }
}
