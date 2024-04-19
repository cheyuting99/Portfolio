import static org.junit.Assert.assertEquals;
import org.junit.Test;
import components.rectangle.Rectangle1;

/**
 * JUnit test fixture for {@code Rectangle}'s kernel
 * methods.
 *
 * @author Yuting Che
 *
 */
public abstract class RectangleTest {

    // tests of getWidth.

    /**
     * Tests the getWidth method with value one
     */
    @Test
    public final void testgetWidth1() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1();
        Rectangle temp = new Rectangle1();
        Rectangle rExpected = new Rectangle1();

        r.setWidth(1);
        r.setHeight(1);

        temp.setWidth(1);
        temp.setHeight(1);

        temp.setWidth(1);
        temp.setHeight(1);

        double w = r.getWidth();
        double wExpected = rExpected.getWidth();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(rExpected, r);
        assertEquals(1,r);
        assertEquals(temp, r);
    }

    /**
     * Tests the getWidth method with value 7.2
     */
    @Test
    public final void testgetWidth7.2() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1(7.2,1);
        Rectangle temp = new Rectangle1(7.2,1);
        Rectangle rExpected = new Rectangle1(7.2,1);

        r.setWidth(7.2);
        r.setHeight(1);

        temp.setWidth(7.2);
        temp.setHeight(1);

        rExpected.setWidth(7.2);
        rExpected.setHeight(1);

        double w = r.getWidth();
        double wExpected = rExpected.getWidth();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(rExpected, r);
        assertEquals(7.2,r);
        assertEquals(temp, r);
    }

    // tests of getHeight.

    /**
     * Tests the getHeight method with value one
     */
    @Test
    public final void testgetHeight1() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1();
        Rectangle temp = new Rectangle1();
        Rectangle rExpected = new Rectangle1();

        r.setWidth(1);
        r.setHeight(1);

        temp.setWidth(1);
        temp.setHeight(1);

        temp.setWidth(1);
        temp.setHeight(1);

        double w = r.getHeight();
        double wExpected = rExpected.getHeight();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(rExpected, r);
        assertEquals(0,r);
        assertEquals(temp, r);
    }

    /**
     * Tests the getHeight method with value 20000
     */
    @Test
    public final void testgetHeight20000() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1(7.2,20000);
        Rectangle temp = new Rectangle1(7.2,20000);
        Rectangle rExpected = new Rectangle1(7.2,20000);

        r.setWidth(7.2);
        r.setHeight(20000);

        temp.setWidth(7.2);
        temp.setHeight(20000);

        rExpected.setWidth(7.2);
        rExpected.setHeight(20000);

        double w = r.getHeight();
        double wExpected = rExpected.getHeight();
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(rExpected, r);
        assertEquals(20000,r);
        assertEquals(temp, r);
    }

    // tests of setWidth

    /**
     * Tests the setWidth method with value 0.1
     */
    @Test
    public final void testSetWidth0.1() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1();
        Rectangle rExpected = new Rectangle1();

        r.setWidth(0.1);
        r.setHeight(1);

        rExpected.setWidth(0.1);
        rExpected.setHeight(1);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(0.1,r.getWidth());
        assertEquals(rExpected, r);
    }

    /**
     * Tests the setWidth method with value 1.2
     */
    @Test
    public final void testSetWidthT1.2() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1();
        Rectangle rExpected = new Rectangle1();

        r.setWidth(1.2);
        r.setHeight(1);

        rExpected.setWidth(1.2);
        rExpected.setHeight(1);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(1.2,r.getWidth());
        assertEquals(rExpected, r);
    }

     // tests of setHeight

    /**
     * Tests the setHeight method with value 1
     */
    @Test
    public final void testSetHeight1() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1();
        Rectangle rExpected = new Rectangle1();

        r.setWidth(0.1);
        r.setHeight(1);

        rExpected.setWidth(0.1);
        rExpected.setHeight(1);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(1,r.getHeight());
        assertEquals(rExpected, r);
    }

    /**
     * Tests the setheight method with value 1.2
     */
    @Test
    public final void testSetHieght1.2() {
        /*
         * Set up variables and call method under test
         */
        Rectangle r = new Rectangle1();
        Rectangle rExpected = new Rectangle1(0,1.2);

        r.setWidth(0.1);
        r.setHeight(1.2);

        rExpected.setWidth(0.1);
        rExpected.setHeight(1.2);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(1.2,r.getHeight());
        assertEquals(rExpected, r);
    }
}
