package figures;
import shape.Shape;
public class Rectangle extends Shape {
    String name = "Rectangle";
    int x1 = 1;
    int y1 = 1;
    int x2 = 1;
    int y2 = 3;
    int x3 = 5;
    int y3 = 3;
    int x4 = 5;
    int y4 = 1;
    double side1 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
    double side2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    @Override
    public void calculateArea(){
        super.calculateArea();
        double areaOfRectangle = Math.abs(side1) * Math.abs(side2);
        System.out.println("Area of triangle is " + areaOfRectangle);
    }
    @Override
    public void calculatePerimeter(){
        super.calculatePerimeter();
        double perimeterOfRectangle = 2 * Math.abs(side1) + 2 * Math.abs(side2);
        System.out.println("Area of triangle is " + perimeterOfRectangle);
    }
    @Override
    public String toString() {
        return "This is " + name;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if(this.x1 != other.x1)
            return false;
        if(this.x2 != other.x2)
            return false;
        if(this.x3 != other.x3)
            return false;
        if(this.x4 != other.x4)
            return false;
        if(this.y1 != other.y1)
            return false;
        if(this.y2 != other.y2)
            return false;
        if(this.y3 != other.y3)
            return false;
        if(this.name.equals(other.name))
            return false;
        return this.y4 == other.y4;
    }
    @Override
    public int hashCode(){
        int result = 11;
        result = 31 * result + x1 + x2 + x3 + x4 + y1 + y2 + y3 + y4 + name.hashCode();
        return result;
    }
}


