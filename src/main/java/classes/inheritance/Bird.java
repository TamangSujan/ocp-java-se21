package classes.inheritance;

public abstract sealed class Bird permits Eagle{
    public String getMammalClass(){
        return "Bird";
    }
}
