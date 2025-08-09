import java.awt.*;

public class ReferenceType {
    public static void main(String[] args) {
        // Keep the same memory address both point variables
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 3;
        System.out.println("point2:: " + point2); // point2:: java.awt.Point[x=3,y=2
        point2.y  = 4;
        System.out.println("point1:: " + point1); // point1:: java.awt.Point[x=3,y=4]
    }
}