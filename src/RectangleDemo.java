import components.Rectangle;

public class RectangleDemo {
    class Rectangle {
        private double width;
        private double height;

        public Rectangle() {
            this.width = 0;
            this.height = 0;
        }
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double calculateArea() {
            return width * height;
        }

        public void resize(double newWidth, double newHeight) {
            this.width = newWidth;
            this.height = newHeight;
        }

        public boolean isInside(double x, double y) {
            return x >= 0 && x <= width && y >= 0 && y <= height;
        }
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
        public static void main(String[] args) {
            // Create a rectangle with initial dimensions
        	double width = 5;
        	double height = 10;
        	Rectangle rectangle = new Rectangle(width, height);

            // Print initial dimensions and area
            System.out.println("Initial dimensions:");
            printDimensions(rectangle);
            System.out.println("Area: " + rectangle.calculateArea());

            // Resize the rectangle
            rectangle.resize(8, 12);

            // Print new dimensions and area
            System.out.println("New dimensions after resizing:");
            printDimensions(rectangle);
            System.out.println("Area: " + rectangle.calculateArea());

            // Check if a point is inside the rectangle
            double x = 6.0;
            double y = 8.0;
            System.out.println("Is point (" + x + ", " + y + ") inside the rectangle? " + rectangle.isInside(x, y));
        }

        private static void printDimensions(Rectangle rectangle) {
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Height: " + rectangle.getHeight());
        }
    }


