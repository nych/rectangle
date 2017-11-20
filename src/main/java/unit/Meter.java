package unit;

import java.util.Objects;

/**
 * Unit implementation representing a meter.
 */
public class Meter implements Unit {

    /** The value in meters **/
    private int value = 0;

    /**
     * Constructs a meter with the passed value
     * @param value meters
     */
    public Meter(int value) {
        this.value = value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public Unit plus(int value) {
        return new Meter(this.value + value);
    }

    @Override
    public Unit plus(Unit unit) {
        return new Meter(this.value + unit.getValue());
    }

    @Override
    public Unit minus(int value) {
        return new Meter(this.value - value);
    }

    @Override
    public Unit minus(Unit unit) {
        return new Meter(this.value - unit.getValue());
    }

    @Override
    public Unit multiply(int value) {
        return new Meter(this.value * value);
    }

    @Override
    public Unit multiply(Unit unit) {
        return new Meter(this.value * unit.getValue());
    }

    @Override
    public Unit divide(int value) {
        return new Meter(this.value / value);
    }

    @Override
    public Unit divide(Unit unit) {
        return new Meter(this.value / unit.getValue());
    }

    @Override
    public Unit modulo(int value) {
        return new Meter(this.value % value);
    }

    @Override
    public Unit modulo(Unit unit) {
        return new Meter(this.value % unit.getValue());
    }

    @Override
    public boolean equal(int value) {
        return this.value == value;
    }

    @Override
    public boolean equal(Unit unit) {
        return this.value == unit.getValue();
    }

    @Override
    public boolean greaterOrEqual(int value) {
        return this.value >= value;
    }

    @Override
    public boolean greaterOrEqual(Unit unit) {
        return this.value >= unit.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this)
            return true;

        if(!(o instanceof Meter))
            return false;

        Meter meter = (Meter) o;

        return this.value == meter.value;
    }
}
