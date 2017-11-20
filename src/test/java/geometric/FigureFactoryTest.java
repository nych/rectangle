package geometric;

import org.junit.Test;
import unit.Meter;

import static org.junit.Assert.*;

public class FigureFactoryTest {

    private FigureFactory figureFactory = new FigureFactory();

    @Test
    public void getMinArea() throws Exception {
        Figure figure = new Rectangle(new Meter(5), new Meter(6));
        assertEquals(figure, this.figureFactory.getMinArea(new Meter(30), Figure.RECTANGLE));

        figure = new Rectangle(new Meter(5), new Meter(5));
        assertEquals(figure, this.figureFactory.getMinArea(new Meter(25), Figure.RECTANGLE));
    }

}