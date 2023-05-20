import figures.Circle;
import figures.Rectangle;
import figures.Triangle;
import shape.Shape;
public class Main {
    public static void main(String[] args) {
        Shape myTriangle = new Triangle();
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        Shape[] arrayOfShapes = { myTriangle, myCircle, myRectangle};
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

        System.out.println(myTriangle.toString());
        System.out.println(myCircle.toString());
        System.out.println(myRectangle.toString());
        System.out.println("--------------------------------------------");

        System.out.println("Equals for Triangle: " + myTriangle.equals(myTriangle));
        System.out.println("Equals for Rectangle: " + myRectangle.equals(myRectangle));
        System.out.println("Equals for Circle: " + myCircle.equals(myCircle));
        System.out.println("--------------------------------------------");

        System.out.println("Equals for Triangle: " + myTriangle.hashCode());
        System.out.println("Equals for Rectangle: " + myRectangle.hashCode());
        System.out.println("Equals for Circle: " + myCircle.hashCode());
    }
}