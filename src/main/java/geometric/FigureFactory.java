package geometric;

import unit.Meter;
import unit.Unit;

/**
 * Figure factory
 */
public class FigureFactory {

    /**
     * Returns the figure for a given are with a minimum perimeter.
     * @param area the area
     * @param figure the type of figure
     * @return figure of the specified type
     */
    public Figure getMinArea(Unit area, int figure) {
        Figure fig = null;

        if(figure == Figure.RECTANGLE) {

            Unit x = new Meter(0);

            for(int i = 1; area.greaterOrEqual(i * i); i++) {
                if(area.modulo(i).equal(0))
                    x.setValue(i);
            }

            Unit y = area.divide(x);

            fig = new Rectangle(x, y);

        } else {
            throw new IllegalArgumentException("Figure unknown.");
        }

        return fig;
    }

}
