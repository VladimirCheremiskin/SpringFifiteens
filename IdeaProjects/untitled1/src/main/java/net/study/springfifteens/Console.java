package net.study.springfifteens;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 7/24/13
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Console {

    public int getMove ();

    public void drawGameField(int [] field);

    public void playGame ();
}
