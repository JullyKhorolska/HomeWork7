package figures;
import shape.Shape;
public class Rectangle extends Shape {
    private final String name;
    int x1, y1, x2, y2, x3, y3, x4, y4;
//    public Rectangle(String name){
//        this.name = name;
//    }

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, String name){
        this.x1 =x1;
        this.y1 =y1;
        this.x2 =x2;
        this.y2 =y2;
        this.x3 =x3;
        this.y3 =y3;
        this.x4 =x4;
        this.y4 =y4;
        this.name = name;
    }

    @Override
    public void calculateArea(){
        super.calculateArea();
        double side1 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double side2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double areaOfRectangle = Math.abs(side1) * Math.abs(side2);
        System.out.println("Area of " + this.name + " is " + areaOfRectangle);
    }
    @Override
    public void calculatePerimeter(){
        super.calculatePerimeter();
        double side1 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double side2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double perimeterOfRectangle = 2 * Math.abs(side1) + 2 * Math.abs(side2);
        System.out.println("Perimeter of " + this.name + " is " + perimeterOfRectangle);
    }
    @Override
    public String toString() {
        return "This is " + this.name;
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
        if(!this.name.equals(other.name))
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


