public class Rectangle {
    Point corner;
    double h, l;

    public Rectangle(Point corner, double h, double l){
        this.h = h;
        this.l = l;
        this.corner = corner;
     }

    public double perimeter() {
        return 2 * (l + h);
    }


    public double Area() {
        return l * h;
    }

}
