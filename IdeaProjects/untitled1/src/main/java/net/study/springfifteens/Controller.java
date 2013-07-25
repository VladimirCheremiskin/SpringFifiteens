package net.study.springfifteens;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 7/24/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Controller {

    public int[] makeMove(int move);

    public boolean testMove (int move);

    public boolean checkWin ();

    public int[] getGameField();
}
