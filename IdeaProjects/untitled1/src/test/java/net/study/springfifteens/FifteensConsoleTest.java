package net.study.springfifteens;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 7/24/13
 * Time: 5:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class FifteensConsoleTest {
    @Mock
    Controller controller;
    FifteensConsole console = new FifteensConsole();


    @Before
    public void setUp(){
        initMocks(this);
        console.setController(controller);
        int[] gamefiled = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        when(controller.checkWin()).thenReturn(true);
        when(controller.makeMove(anyInt())).thenReturn(gamefiled);
        when(controller.testMove(anyInt())).thenReturn(true);
    }


    @Test
    public void testPlayGame() throws Exception {
        int[] expected = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        console.playGame();
        verify(controller).checkWin();
        assertArrayEquals(expected,controller.makeMove(1));
        assertEquals(expected[0],console.getMove());
    }
}
