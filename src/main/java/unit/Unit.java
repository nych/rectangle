package unit;

/**
 * Abstract measurement unit wrapping integer values.
 */
public interface Unit {

    /**
     * Setter for unit value.
     * @param value an integer denoting the value
     */
    public void setValue(int value);

    /**
     * Getter for unit value.
     * @return the unit value as an integer
     */
    public int getValue();

    /**
     * Adds an integer value to the unit.
     * @param value the integer value to add
     * @return the sum as a Unit instance
     */
    public Unit plus(int value);

    /**
     * Adds two Unit instances.
     * @param unit the Unit instance to add
     * @return the sum as a Unit instance
     */
    public Unit plus(Unit unit);

    /**
     * Subtracts an integer value from the unit.
     * @param value the integer value to subtract
     * @return the difference as a Unit instance
     */
    public Unit minus(int value);

    /**
     * Subtracts two Unit instances.
     * @param unit the Unit instance to subtract
     * @return the difference as a Unit instance
     */
    public Unit minus(Unit unit);

    /**
     * Multiplies an integer value with the unit.
     * @param value the integer value to multiply
     * @return the product as a Unit instance
     */
    public Unit multiply(int value);

    /**
     * Multiplies two Unit instances.
     * @param unit the Unit instance to multiply
     * @return the product as a Unit instance
     */
    public Unit multiply(Unit unit);

    /**
     * Divides the Unit by an integer value.
     * @param value the integer value to divide the unit with
     * @return the fraction as a Unit instance
     */
    public Unit divide(int value);

    /**
     * Divides two Unit instances.
     * @param unit the Unit instance to divide the unit with
     * @return the fraction as a Unit instance
     */
    public Unit divide(Unit unit);

    /**
     * Calculates modulus of the unit with an integer value.
     * @param value the integer value to calculate the modulus with
     * @return the modulus as Unit a instance
     */
    public Unit modulo(int value);

    /**
     * Calculates modulus two Unit instances.
     * @param unit the Unit instance to calculate the modulus with
     * @return the modulus as Unit a instance
     */
    public Unit modulo(Unit unit);

    /**
     * Checks if an integer value is equal to the unit value.
     * @param value the integer value to compare
     * @return true if the integer value and the unit value are equal, false
     * otherwise
     */
    public boolean equal(int value);

    /**
     * Checks if two Unit instances have the same value.
     * Do not confuse this method with equals! This method only tests whether
     * the values of the Unit instances are equal or not.
     * @param unit the Unit instance to compare
     * @return true if the values of the two Unit instances are equal, false
     * otherwise
     */
    public boolean equal(Unit unit);

    /**
     * Checks if the unit value is greater or equal to an integer value.
     * @param value the integer value to compare
     * @return true if the unit value is greater or equal to the passed integer
     * value, false otherwise
     */
    public boolean greaterOrEqual(int value);

    /**
     * Checks if the Unit instance is greater or equal to another Unit
     * instance.
     * @param unit the unit Instance to compare
     * @return true if the Unit instance is greater or equal to the passed Unit
     * instance, false otherwise
     */
    public boolean greaterOrEqual(Unit unit);
}
