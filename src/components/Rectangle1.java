package components;
import java.util.Iterator;

import components.rectangle.Rectangle;
import components.rectangle.RectangleSecondary;
import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * This class represents a rectangle data structure implemented using a sequence.
 *
 * Convention:
 * - Method names follow camelCase convention.
 * - Constants are named in all uppercase with underscores.
 *
 * Correspondence:
 * - The Rectangle stores two double. The first one is width, and the second one is height.
 * - The sequence is used to store elements of the rectangle, and its size is exactly 2.
 */

public class Rectangle1 extends RectangleSecondary {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Entries included in {@code this}.
     */
    private Sequence<Double> entries;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.entries = new Sequence1L<T>();
    }

    /*
     * Constructor ------------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public Rectangle1() {
        this.createNewRep();
    }

    /*
     * Standard methods -------------------------------------------------------
     */

    @Override
    public final Rectangle newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(Rectangle source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof Queue3<?> : ""
                + "Violation of: source is of dynamic type Queue3<?>";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case: source must be of dynamic type Rectangle.
         */
        Rectangle localSource = (Rectangle) source;
        this.entries = localSource.entries;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

    @Override
    public final double getWidth() {
        assert this.length() > 0 : "Violation of: this /= <>";

        double width = this.entries.entry(0);
        return width;
    }

    @Override
    public final double getHeight(); {
        assert this.length() > 0 : "Violation of: this /= <>";

        double height = this.entries.entry(1);
        return height;
    }

    @Override
    public final void setWidth(double width); {
        assert this.length() = 0 : "Violation of: this = <>";
        this.entries.add(0,width);
    }

    @Override
    public final void setHeight(double height); {
        assert this.length() = 1 : "Violation of: this.length = 1";
        this.entries.add(1,width);
    }

    @Override
    public final Iterator<Double> iterator() {
        return this.entries.iterator();
    }
}
