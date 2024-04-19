import java.util.Scanner;

public class largestAreaOfAGivenNum {

    static class Rectangle {
        private double width;
        private double height;

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

    }

    /**
     * Main method to find the largest area of a given number of rectangles.
     *
     * @param args the command line arguments; unused here
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rectangles
        System.out.print("Enter the number of rectangles: ");
        int numRectangles = scanner.nextInt();

        // Initialize variables to store information about the largest area
        double largestArea = Double.MIN_VALUE;
        double largestWidth = 0;
        double largestHeight = 0;

        // Input dimensions for each rectangle and find the largest area
        for (int i = 1; i <= numRectangles; i++) {
            System.out.println("\nEnter dimensions for rectangle " + i + ":");
            System.out.print("Width: ");
            double width = scanner.nextDouble();
            System.out.print("Height: ");
            double height = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width, height);
            double area = rectangle.calculateArea();

            if (area > largestArea) {
                largestArea = area;
                largestWidth = width;
                largestHeight = height;
            }
        }

        // Output the largest area and its corresponding rectangle dimensions
        System.out.println("\nThe largest area is: " + largestArea);
        System.out.println("Dimensions of the corresponding rectangle:");
        System.out.println("Width: " + largestWidth);
        System.out.println("Height: " + largestHeight);

        scanner.close();
    }
}
