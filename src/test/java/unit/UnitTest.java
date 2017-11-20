package unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    private Unit unit = new Meter(10);

    @Test
    public void getValue() throws Exception {
        assertEquals(10, this.unit.getValue());
    }

    @Test
    public void plus() throws Exception {
        assertEquals(new Meter(15), this.unit.plus(5));
        assertEquals(new Meter(20), this.unit.plus(this.unit));
    }

    @Test
    public void minus() throws Exception {
        assertEquals(new Meter(5), this.unit.minus(5));
        assertEquals(new Meter(0), this.unit.minus(this.unit));
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(new Meter(50), this.unit.multiply(5));
        assertEquals(new Meter(100), this.unit.multiply(this.unit));
    }

    @Test
    public void divide() throws Exception {
        assertEquals(new Meter(2), this.unit.divide(5));
        assertEquals(new Meter(1), this.unit.divide(this.unit));
    }

    @Test
    public void modulo() throws Exception {
        assertEquals(new Meter(1), this.unit.modulo(3));
        assertEquals(new Meter(0), this.unit.modulo(this.unit));
    }

    @Test
    public void equal() throws Exception {
        assertFalse(this.unit.equal(5));
        assertTrue(this.unit.equal(this.unit));
    }

    @Test
    public void greaterOrEqual() throws Exception {
        assertFalse(this.unit.greaterOrEqual(15));
        assertTrue(this.unit.greaterOrEqual(this.unit));
    }

}