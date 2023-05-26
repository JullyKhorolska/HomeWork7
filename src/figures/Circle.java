package figures;

import shape.Shape;

public class Circle extends Shape {
    String name = "Circle";
    int x1, y1, x2, y2;

    public Circle( int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    double areaOfCircle;
    double perimeterOfCircle;
    private double radiusCalc(){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    @Override
     public void calculateArea(){
        super.calculateArea();
        areaOfCircle = Math.PI * Math.pow(radiusCalc(), 2);
        System.out.println("Area of circle is " + areaOfCircle);
    }
    @Override
    public void calculatePerimeter(){
        super.calculateArea();
        perimeterOfCircle = 2 * 3.14 * Math.abs(radiusCalc());
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
        if(this.y1 != other.y1)
            return false;
        if(radiusCalc() != radiusCalc())
            return false;
        return true;
    }
    @Override
    public int hashCode(){
        int result = 11;
        result = 31 * result + x1 + x2 + y1 + y2 + name.hashCode();
        return result;
    }
}
