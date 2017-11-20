package geometric;

import unit.Unit;

import java.util.Objects;

/**
 * A rectangle figure implementation
 */
public class Rectangle implements Figure {

    /** Side x **/
    private Unit x = null;

    /** Side y **/
    private Unit y = null;

    /**
     * Default Constructor
     * @param x
     * @param y
     */
    public Rectangle(Unit x, Unit y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Setter for side x
     * @param x length of side x
     */
    public void setX(Unit x) {
        this.x = x;
    }

    /**
     * Getter for side x
     * @return length of side x
     */
    public Unit getX() {
        return this.x;
    }

    /**
     * Setter for side y
     * @param y length of side y
     */
    public void setY(Unit y) {
        this.y = y;
    }

    /**
     * Getter for side y
     * @return length of side y
     */
    public Unit getY() {
        return this.y;
    }

    @Override
    public Unit getPerimeter() {
        return this.x.plus(this.y).multiply(2);
    }

    @Override
    public Unit getArea() {
        return this.x.multiply(this.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this)
            return true;

        if(!(o instanceof Rectangle))
            return false;

        Rectangle other = (Rectangle) o;

        return Objects.equals(this.x, other.x) &&
                Objects.equals(this.y, other.y);
    }
}
