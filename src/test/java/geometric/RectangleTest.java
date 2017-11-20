package geometric;

import static org.junit.Assert.*;

public class RectangleTest {

    @org.junit.Test
    public void getPerimeter() throws Exception {
        Figure figure = new Rectangle(5, 6);
        assertEquals(22 , figure.getPerimeter());

        figure = new Rectangle(5, 5);
        assertEquals(20 , figure.getPerimeter());
    }

    @org.junit.Test
    public void getArea() throws Exception {
        Figure figure = new Rectangle(5, 6);
        assertEquals(30 , figure.getArea());

        figure = new Rectangle(5, 5);
        assertEquals(25 , figure.getArea());
    }

}