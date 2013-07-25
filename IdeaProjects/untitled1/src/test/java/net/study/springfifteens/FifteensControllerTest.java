package net.study.springfifteens;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;


public class FifteensControllerTest {
    @Mock
      Service service;

    FifteensController controller = new FifteensController();


    @Before
    public void setUp(){
        initMocks(this);
        controller.setService(service);
        int[] gamefiled = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        when(service.isWin()).thenReturn(true);
        when(service.move(anyInt())).thenReturn(gamefiled);
        when(service.isMovePossible(anyInt())).thenReturn(true);
    }


    @Test
    public void testPlayGame() throws Exception {
        int[] expected = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        assertArrayEquals(controller.makeMove(1),expected);
        assertEquals(controller.testMove(1),true);
        assertEquals(controller.checkWin(),true);

    }

}
