package geometric;

import unit.Meter;

import static org.junit.Assert.*;

public class RectangleTest {

    @org.junit.Test
    public void getPerimeter() throws Exception {
        Figure figure = new Rectangle(new Meter(5), new Meter(6));
        assertEquals(new Meter(22) , figure.getPerimeter());

        figure = new Rectangle(new Meter(5), new Meter(5));
        assertEquals(new Meter(20) , figure.getPerimeter());
    }

    @org.junit.Test
    public void getArea() throws Exception {
        Figure figure = new Rectangle(new Meter(5), new Meter(6));
        assertEquals(new Meter(30), figure.getArea());

        figure = new Rectangle(new Meter(5), new Meter(5));
        assertEquals(new Meter(25), figure.getArea());
    }

}