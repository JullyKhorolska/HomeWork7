package shape;

public class Shape {
    public Shape(){

    }
    public String color;

    public void calculateArea(){
        System.out.println("This method is used for shape's area calculation");
    }
    public void calculatePerimeter(){
        System.out.println("This method is used for shape's perimeter calculation");
    }
    public void paint(String color){
        this.color = color;
        System.out.println("Color: " + this.color);
    }

}
