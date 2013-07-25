package net.study.springfifteens;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 7/25/13
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Service {

    boolean isWin();

    int [] move(int move);

    int [] getGameField();

    boolean isMovePossible(int pos);
}
