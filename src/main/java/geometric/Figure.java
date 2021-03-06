package geometric;

import unit.Unit;

/**
 * Figure represents geometrical figures.
 */
public interface Figure {

    /** Denotes a rectangle **/
    public static final int RECTANGLE = 0;

    /**
     * Calculates the perimeter of the figure.
     * @return the perimeter of the figure
     */
    public Unit getPerimeter();

    /**
     * Calculates the area of the figure
     * @return the area of the figure
     */
    public Unit getArea();
}
