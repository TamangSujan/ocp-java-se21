package classes.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        /*
        * sealed is used to restrict inheritance
        * All class must be final which extends the parent
        * If class is not final but needs to extends then non-sealed must be used so that any class
        * can extends that child class which extends sealed parent class
        */
        Bird bird = new Birdy();
        System.out.println(bird.getMammalClass());
        Birdy birdy = new Birdy();
        System.out.println(birdy.getMammalClass());
    }
}
