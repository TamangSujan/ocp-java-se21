package pattern;

public class Nest {

    record Point(int x, int y){}
    enum Color{ RED, BLUE, GREEN }
    record ColorPoint(Point p, Color c){}
    record Rectangle(ColorPoint first, ColorPoint second){}

    public static void main(String[] args) {
        Point point = new Point(5, 5);
        ColorPoint colorPoint = new ColorPoint(point, Color.BLUE);
        Rectangle rectangle = new Rectangle(colorPoint, colorPoint);
        check(rectangle);
    }

    private static void check(Object o){
        if(o instanceof Rectangle(ColorPoint(Point p, var c), var cp)){
            System.out.println(p.x + ", " + p.y);
            System.out.println(c);
            System.out.println(cp);
        }
    }
}
