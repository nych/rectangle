package geometric;

import java.util.Objects;

/**
 * A rectangle figure implementation
 */
public class Rectangle implements Figure {

    /** Side x **/
    private int x = 0;

    /** Side y **/
    private int y = 0;

    /**
     * Default Constructor
     * @param x
     * @param y
     */
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Setter for side x
     * @param x length of side x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter for side x
     * @return length of side x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Setter for side y
     * @param y length of side y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter for side y
     * @return length of side y
     */
    public int getY() {
        return this.y;
    }

    @Override
    public int getPerimeter() {
        return 2 * this.x + 2 * this.y;
    }

    @Override
    public int getArea() {
        return this.x * this.y;
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

        return this.x == other.x && this.y == other.y;
    }
}
