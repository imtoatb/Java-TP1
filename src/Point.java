import java.lang.Math;
public class Point {
    double a, b;

    public Point(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt((p1.a - p2.a)*(p1.a - p2.a) + (p1.b - p2.b)*(p1.b - p2.b));
    }

    public void display(){
        System.out.println("(" + a + ", " + b + ")");
    }

    public static double distanceStat(Point p1, Point p2) {
        return Math.sqrt((p1.a - p2.a)*(p1.a - p2.a) + (p1.b - p2.b)*(p1.b - p2.b));
    }
}
