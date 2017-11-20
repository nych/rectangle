package geometric;

import org.junit.Test;

import static org.junit.Assert.*;

public class FigureFactoryTest {

    private FigureFactory figureFactory = new FigureFactory();

    @Test
    public void getMinArea() throws Exception {
        Figure figure = new Rectangle(5, 6);
        assertEquals(figure, this.figureFactory.getMinArea(30, Figure.RECTANGLE));

        figure = new Rectangle(5, 5);
        assertEquals(figure, this.figureFactory.getMinArea(25, Figure.RECTANGLE));
    }

}