package figures;
import shape.Shape;
public class Rectangle extends Shape {
    private String name;
    int x1, y1, x2, y2, x3, y3, x4, y4;
    double areaOfRectangle;
    double perimeterOfRectangle;

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
    protected double calculateSide(int x1, int y1, int x2, int y2){
        return Math.abs(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    @Override
    public void calculateArea(){
        super.calculateArea();
        areaOfRectangle = calculateSide(x3, y3, x2, y2) * calculateSide(x2, y2, x1, y1);
        System.out.println("Area of " + this.name + " is " + areaOfRectangle);
    }
    @Override
    public void calculatePerimeter(){
        super.calculatePerimeter();
        perimeterOfRectangle = 2 * (calculateSide(x3, y3, x2, y2) + calculateSide(x2, y2, x1, y1));
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


