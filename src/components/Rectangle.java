package components;
import components.rectangle.RectangleKernel;

/**
 * This interface represents an enhanced version of a Rectangle, inheriting from the kernel interface.
 * It may contain additional functionality in future iterations.
 */
public interface Rectangle extends RectangleKernel {

    /**
     * Checks if the given rectangle has valid dimensions (positive width and height).
     *
     * @return true if the dimensions are valid, false otherwise
     */
    boolean isValidDimensions();

    /**
     * Calculates the area of the given rectangle.
     *
     * @return the area of the rectangle
     */
    double calculateArea();

     /**
     * Calculates the perimeter of the given rectangle.
     *
     * @return the perimeter of the rectangle
     */
    double calculatePerimeter();

    /**
     * Resizes the rectangle to the specified dimensions.
     *
     * @param newWidth  the new width of the rectangle
     *
     * @param newHeight the new height of the rectangle
     *
     * @update this
     *
     * @ensure this.width = newWidth
     * @ensure this.height = newHeight
     */
    void resize(double newWidth, double newHeight);

    /**
     * Computes the length of the diagonal of the given rectangle.
     *
     * @return the length of the diagonal
     */
    double diagonal();

}
