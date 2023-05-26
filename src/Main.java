import figures.Circle;
import figures.Rectangle;
import figures.Triangle;
import shape.Shape;
public class Main {
    public static void main(String[] args) {

        Shape myTriangle = new Triangle(1, -1, 7, 2, 5, 6);
        Shape myTriangle1 = new Triangle(1, -1, 7, 2, 5, 6);


        Shape myCircle = new Circle(4,-1,0,2);
        Shape myCircle1 = new Circle(5,1,4,-2);
        Shape myCircle2 = new Circle(4,-1,0,-2);


        Shape myRectangle = new Rectangle(1, -7, -3, 3, 5, 4, 5, 1, "FirstRectangle");
        Shape myRectangle1 = new Rectangle(1, -7, -3, 3, 5, 4, 5, 1, "FirstRectangle");
        Shape myRectangle2 = new Rectangle(1, -7, -3, 3, 5, 4, 5, 1, "ThirdRectangle");




        Shape[] arrayOfShapes = { myCircle, myCircle1, myRectangle,myRectangle2, myTriangle,myTriangle1};
        for (Shape arrayOfShape : arrayOfShapes) {
            arrayOfShape.calculateArea();
            arrayOfShape.calculatePerimeter();
            if(arrayOfShape == myTriangle) {
                arrayOfShape.paint("red");
            }else if(arrayOfShape == myCircle) {
                arrayOfShape.paint("yellow");
            } else arrayOfShape.paint("green");
            System.out.println("----------------------\n");
        }

        System.out.println(myTriangle);
        System.out.println(myCircle);
        System.out.println(myRectangle);
        System.out.println(myRectangle2);
        System.out.println("--------------------------------------------");

        System.out.println("Equals for Triangle: " + myTriangle.equals(myTriangle));
        System.out.println("Equals for Triangle and Rectangle: " + myTriangle.equals(myRectangle));
        System.out.println("Equals for Triangles with the same coordinates: " + myTriangle.equals(myTriangle1) + "\n");

        System.out.println("Equals for Rectangle with the same names and the same coordinates: " + myRectangle.equals(myRectangle1));
        System.out.println("Equals for Rectangle with different names and the same coordinates: " + myRectangle.equals(myRectangle2));
        System.out.println("Equals for Rectangle and Circle: " + myRectangle.equals(myCircle) + "\n");

        System.out.println("Equals for Circle with different coordinates: " + myCircle.equals(myCircle1));
        System.out.println("Equals for Circle with the same radius: " + myCircle.equals(myCircle2));
        System.out.println("Equals for Circle and Triangle: " + myCircle.equals(myTriangle) + "\n");
        System.out.println("--------------------------------------------");

        System.out.println("Hashcode for Triangle: " + myTriangle.hashCode());
        System.out.println("Hashcode for Rectangle: " + myRectangle.hashCode());
        System.out.println("Hashcode for Circle: " + myCircle.hashCode());
    }
}