package pattern;

public class Records {

    record Point(int x, int y){}

    public static void main(String[] args) {
        Point p = new Point(5, 5);
        System.out.println(isHigherThanOrigin(p));
    }

    private static boolean isHigherThanOrigin(Object o){
        if(o instanceof Point(int x, int y)){
            return x > 0 && y > 0;
        }
        return false;
    }
}
