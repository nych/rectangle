package geometric;

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
    public Figure getMinArea(int area, int figure) {
        Figure fig = null;

        if(figure == Figure.RECTANGLE) {

            int x = 0;

            for(int i = 1; i * i <= area; i++) {
                if (area % i == 0)
                    x = i;
            }

            int y = area / x;

            fig = new Rectangle(x, y);

            } else {
            throw new IllegalArgumentException("Figure unknown.");
        }

        return fig;
    }

}
