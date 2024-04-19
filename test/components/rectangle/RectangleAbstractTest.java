import static org.junit.Assert.*;
import org.junit.Test;

import components.Rectangle1;
import components.rectangle.Rectangle;

public class RectangleAbstractTest {

    /**
     * Test case for isValidDimensions() method with valid dimensions.
     */
    @Test
    public void testIsValidDimensions_ValidDimensions() {
        Rectangle rectangle = new Rectangle1();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        assertTrue(rectangle.isValidDimensions());
    }

    /**
     * Test case for isValidDimensions() method with negative width.
     */
    @Test
    public void testIsValidDimensions_NegativeWidth() {
        Rectangle rectangle = new Rectangle1();
        rectangle.setWidth(-5);
        rectangle.setHeight(10);
        assertFalse(rectangle.isValidDimensions());
    }

    /**
     * Test case for isValidDimensions() method with negative height.
     */
    @Test
    public void testIsValidDimensions_NegativeHeight() {
        Rectangle rectangle = new Rectangle1();
        rectangle.setWidth(5);
        rectangle.setHeight(-10);
        assertFalse(rectangle.isValidDimensions());
    }

    /**
     * Test case for isValidDimensions() method with negative width and height.
     */
    @Test
    public void testIsValidDimensions_NegativeWidthAndHeight() {
        Rectangle rectangle = new Rectangle1();
        rectangle.setWidth(-5);
        rectangle.setHeight(-10);
        assertFalse(rectangle.isValidDimensions());
    }

    /**
     * Test case for calculateArea() method with area 35.
     */
    @Test
    public void testCalculateArea35() {
        Rectangle r = new Rectangle1();
        r.setWidth(5);
        r.setHeight(7);
        assertEquals(35, r.calculateArea(), 0.001);
    }

    /**
     * Test case for calculateArea() method with area 3500.
     */
    @Test
    public void testCalculateArea3500() {
        Rectangle r = new Rectangle1();
        r.setWidth(50);
        r.setHeight(70);
        assertEquals(3500, r.calculateArea(), 0.001);
    }

    /**
     * Test case for calculateArea() method with area 250000.
     */
    @Test
    public void testCalculateArea250000() {
        Rectangle r = new Rectangle1();
        r.setWidth(500);
        r.setHeight(500);
        assertEquals(250000, r.calculateArea(), 0.001);
    }

    /**
     * Test case for calculateArea() method with perimeter 24.
     */
    @Test
    public void testCalculatePerimeter24() {
        Rectangle r = new Rectangle1();
        r.setWidth(5);
        r.setHeight(7);
        assertEquals(24, r.calculatePerimeter(), 0.001);
    }

    /**
     * Test case for calculateArea() method with perimeter 4.
     */
    @Test
    public void testCalculatePerimeter4() {
        Rectangle r = new Rectangle1();
        r.setWidth(1);
        r.setHeight(1);
        assertEquals(4, r.calculatePerimeter(), 0.001);
    }

    /**
     * Test case for calculateArea() method with perimeter 40000.
     */
    @Test
    public void testCalculatePerimeter40000() {
        Rectangle r = new Rectangle1();
        r.setWidth(10000);
        r.setHeight(10000);
        assertEquals(40000, r.calculatePerimeter(), 0.001);
    }

    /**
     * Test case for resize() method with increasing dimensions.
     */
    @Test
    public void testResize() {
        Rectangle r = new Rectangle1();
        r.setWidth(5);
        r.setHeight(7);
        r.resize(10, 14);
        Rectangle rCopy = new Rectangle1();
        rCopy.setWidth(10);
        rCopy.setHeight(14);
        assertEquals(10, r.getWidth(), 0.001);
        assertEquals(14, r.getHeight(), 0.001);
        assertEquals(rCopy,r);
    }

    /**
     * Test case for resize() method with decreasing dimensions.
     */
    @Test
    public void testResize() {
        Rectangle r = new Rectangle1();
        r.setWidth(5);
        r.setHeight(7);
        r.resize(7, 5);
        Rectangle rCopy = new Rectangle1();
        rCopy.setWidth(7);
        rCopy.setHeight(5);
        assertEquals(7, r.getWidth(), 0.001);
        assertEquals(5, r.getHeight(), 0.001);
        assertEquals(rCopy,r);
    }

    /**
     * Test case for diagonal() method with a rectangle having dimensions 3x4.
     */
    @Test
    public void testDiagonal_5() {
        Rectangle r = new Rectangle1();
        r.setWidth(3);
        r.setHeight(4);
        assertEquals(5, r.diagonal(), 0.001);
    }

    /**
     * Test case for diagonal() method with a rectangle having dimensions 5x12.
     */
    @Test
    public void testDiagonal_13() {
        Rectangle r = new Rectangle1();
        r.setWidth(5);
        r.setHeight(12);
        assertEquals(13, r.diagonal(), 0.001);
    }

    /**
     * Test case for diagonal() method with a rectangle having dimensions 6x8.
     */
    @Test
    public void testDiagonal_10() {
        Rectangle r = new Rectangle1();
        r.setWidth(6);
        r.setHeight(8);
        assertEquals(10, r.diagonal(), 0.001);
    }
}
