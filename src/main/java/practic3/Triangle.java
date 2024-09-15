package practic3;

public class Triangle extends Figure{
    Point a,b,c;
    double len1, len2, len3;
    public Triangle(Point a, Point b, Point c){
        if (a == null || b == null || c == null){
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
        if (((len1 + len2) < len3) || ((len1 + len3) < len2) || ((len2 + len3) < len1)){
            System.out.println("Точки не принадлежат треугольнику");
        }
        else {
            len1 = getLen1();
            len2 = getLen2();
            len3 = getLen3();
        }

    }
    public String pointsToString(){

        return "("+ a.getX() + "," + a.getY() + ")" +
                "("+ b.getX() + "," + b.getY() + ")" +
                "("+ c.getX() + "," + c.getY() + ")";

    }
    public double getLen1() {
        double xDistance = Math.pow(a.getX() - b.getX(), 2);
        double yDistance = Math.pow(a.getY() - b.getY(),2);
        return Math.sqrt(xDistance + yDistance);
    }

    public double getLen2() {
        double xDistance = Math.pow(a.getX() - c.getX(), 2);
        double yDistance = Math.pow(a.getY() - c.getY(),2);
        return Math.sqrt(xDistance + yDistance);
    }

    public double getLen3() {
        double xDistance = Math.pow(c.getX() - b.getX(), 2);
        double yDistance = Math.pow(c.getY() - b.getY(),2);
        return Math.sqrt(xDistance + yDistance);
    }

    public double area(){
        return Math.abs(0.5*((c.getX() - a.getX()) * (b.getY() - a.getY()) -
                (c.getY() - a.getY()) * (b.getX() - a.getX())));
    }
}
