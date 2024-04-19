package components;
import components.rectangle.Rectangle;

public abstract class RectangleSecondary implements Rectangle {

    /**
     * Calculates the area of the largest circle that can fit inside the rectangle.
     *
     * @return the area of the largest circle
     */
    double LargestCircleAreaIn(){
        double h = this.getHeight();
        double w = this.getWidth();
        double radius = 0;
        if(h>w){
            radius = w * 0.5;
        }else{
            radius = h * 0.5;
        }
        double area = pi*radius*radius;
        return area;
    }

     /**
     * Calculates the area of the smallest circle that completely encloses the rectangle.
     *
     * @return the area of the smallest enclosing circle
     */
    double SmallestCircleAreaOut(){
        double radius = this.diagonal() * 0.5;
        double area = pi*radius*radius;
        return area;
    }

    /**
     * Calculates the circumference of the largest circle that can fit inside the rectangle.
     *
     * @return the circumference of the largest circle
     */
    double LargestCircumIn(){
        double h = this.getHeight();
        double w = this.getWidth();
        double radius = 0;
        if(h>w){
            radius = w * 0.5;
        }else{
            radius = h * 0.5;
        }
        double c = 2 * pi * radius;
        return c;
    }

    /**
     * Calculates the circumference of the smallest circle that completely encloses the rectangle.
     *
     * @return the circumference of the smallest enclosing circle
     */
    double SmallestCircumOut(){
        double diagonal = this.diagonal();
        double c = diagonal*pi;
        return c;
    }

}
