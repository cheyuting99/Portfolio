package components;
import components.Rectangle;

/**
 * This interface represents the kernel functionality of a Rectangle.
 * It defines methods to get and set the dimensions of the rectangle,
 * calculate its area and perimeter, resize it, and find its intersection
 * with another rectangle.
 */
public interface RectangleKernel extends Standard<Rectangle> {
    /**
     * Gets the width of this rectangle.
     *
     * @return The width of the rectangle.
     */
    double getWidth();

    /**
     * Gets the height of this rectangle.
     *
     * @return The height of the rectangle.
     */
    double getHeight();

    /**
     * Sets the width of this rectangle.
     *
     * @param width The new width of the rectangle.
     * @ensure this.width = width
     */
    void setWidth(double width);

    /**
     * Sets the height of this rectangle.
     *
     * @param height The new height of the rectangle.
     * @ensure this.height = height
     */
    void setHeight(double height);

}
