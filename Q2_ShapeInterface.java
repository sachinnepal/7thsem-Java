
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r){ this.r = r; }

    public double area(){ return Math.PI*r*r; }
    public double perimeter(){ return 2*Math.PI*r; }
}

class Rectangle implements Shape {
    double l,b;
    Rectangle(double l,double b){ this.l=l; this.b=b; }

    public double area(){ return l*b; }
    public double perimeter(){ return 2*(l+b); }

    class Diagonal{
        double getDiagonal(){
            return Math.sqrt(l*l + b*b);
        }
    }
}

public class Q2_ShapeInterface{
    public static void main(String[] args){
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4,3);
        Rectangle.Diagonal d = r.new Diagonal();

        System.out.println("Circle Area: "+c.area());
        System.out.println("Circle Perimeter: "+c.perimeter());

        System.out.println("Rectangle Area: "+r.area());
        System.out.println("Rectangle Perimeter: "+r.perimeter());
        System.out.println("Rectangle Diagonal: "+d.getDiagonal());
    }
}
