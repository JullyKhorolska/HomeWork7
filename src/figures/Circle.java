package figures;

import shape.Shape;

public class Circle extends Shape {
    String name = "Circle";
    int x1;
    int y1;
    int x2;
    int y2;
    public Circle( int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
     public void calculateArea(){

        super.calculateArea();
        double areaOfCircle = 3.14 * (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Area of circle is " + areaOfCircle);
    }
    @Override
    public void calculatePerimeter(){
        super.calculateArea();
        double perimeterOfCircle = 2 * 3.14 * Math.abs(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("Area of circle is " + perimeterOfCircle);
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
        Circle other = (Circle) obj;
        if(this.x1 != other.x1)
            return false;
        if(this.x2 != other.x2)
            return false;
        if(this.y1 != other.y1)
            return false;
        return this.y2 == other.y2;
    }
    @Override
    public int hashCode(){
        int result = 11;
        result = 31 * result + x1 + x2 + y1 + y2 + name.hashCode();
        return result;
    }
}
