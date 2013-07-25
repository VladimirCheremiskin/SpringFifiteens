package net.study.springfifteens;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 7/25/13
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class FifteensController implements Controller {

    private Service service;

    @Override
    public int[] getGameField(){
        return service.getGameField();
    }

    @Override
    public int[] makeMove(int move) {
        if (testMove(move)){
        return service.move(move);
        } else {
            return service.getGameField();
        }
    }

    @Override
    public boolean testMove(int move) {
        return service.isMovePossible(move);
    }

    @Override
    public boolean checkWin() {
        return service.isWin();
    }

    public void setService(Service service) {
        this.service = service;
    }
}
