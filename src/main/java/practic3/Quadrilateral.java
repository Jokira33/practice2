package practic3;

public class Quadrilateral extends Figure{
    Point a,b,c, d;
    public Quadrilateral(Point a, Point b, Point c, Point d){
        if (a == null || b == null || c == null || d == null){
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;


    }
    public String pointsToString(){

        return "("+ a.getX() + "," + a.getY() + ")" +
                "("+ b.getX() + "," + b.getY() + ")" +
                "("+ c.getX() + "," + c.getY() + ")" +
                "("+ d.getX() + "," + d.getY() + ")";

    }


    public double area1(){
        return Math.abs(0.5*((c.getX() - a.getX()) * (b.getY() - a.getY()) -
                (c.getY() - a.getY()) * (b.getX() - a.getX())));
    }
    public double area2(){
        return Math.abs(0.5*((c.getX() - a.getX()) * (d.getY() - a.getY()) -
                (c.getY() - a.getY()) * (d.getX() - a.getX())));
    }
    public double area(){
        return area1() + area2();
    }
}
