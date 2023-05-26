package figures;

import shape.Shape;

public class Triangle extends Shape {
    String name = "Triangle";
    int x1, y1, x2, y2, x3, y3;

    double areaOfTriangle;
    double perimeterOfTriangle;
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.x1 =x1;
        this.y1 =y1;
        this.x2 =x2;
        this.y2 =y2;
        this.x3 =x3;
        this.y3 =y3;
    }
    private double calculateSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    @Override
    public void  calculateArea(){
        super.calculateArea();
        areaOfTriangle = 0.5 * Math.abs((x1 * y2 - y1 * x2 + x2 *y3 - y2 * x3 + x3 * y1 - y3 * x1));
        System.out.println("Area of triangle = " + areaOfTriangle);
    }
    @Override
    public void  calculatePerimeter(){
        super.calculatePerimeter();
        perimeterOfTriangle = Math.abs(calculateSide(x1, y1, x2, y2))
                + Math.abs(calculateSide(x3, y3, x2, y2))
                + Math.abs(calculateSide(x3, y3, x1, y1));
        System.out.println("Perimeter of triangle = " + perimeterOfTriangle);
    }
    @Override
    public String toString(){
        return "This is " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        Triangle other = (Triangle) obj;
        if(this.x1 != other.x1)
            return false;
        if(this.x2 != other.x2)
            return false;
        if(this.x3 != other.x3)
            return false;
        if(this.y1 != other.y1)
            return false;
        if(this.y2 != other.y2)
            return false;
        return this.y3 == other.y3;
    }
    @Override
    public int hashCode(){
        int result = 11;
        result = 31 * result + x1 + x2 + x3 + y1 + y2 + y3 + name.hashCode();
        return result;
    }
}
