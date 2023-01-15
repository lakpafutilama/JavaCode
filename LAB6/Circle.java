/**
 * Write a class Circle with a parameterized constructor. If no parameters are passed then its default constructor should be invoke
   parameterized constructor with default values. A circle is defined using radius and circumference.
 *
 * @author (Lakpa Futi Lama)
 * @version (6)
 */
import java.util.*;
public class Circle
{
    int radius;
    
    public Circle(int r)
    {
        radius=r;
    }
    
    public Circle()
    {
        radius=7;
    }

    public double getCircumference()
    {
        double p= Math.PI;
        return 2*p*radius;
    }
}