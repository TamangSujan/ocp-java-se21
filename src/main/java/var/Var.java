package var;

public class Var {

    // var classVariable; var keyword does not work on class level variable

    public static void main(String[] args) {
        var var = getVarObject();
        System.out.println("var.Var object reference value: " + var);
        System.out.println("Keyword var only works with local variable with initializer.");
    }

    // private static void doesNotCompile(var parameter){} var keyword does not work on parameter of a method

    private static void doesNotCompile(){
        // var localVariable; var keyword does not work without initializer
    }

    // private static var getVar(){ return new var.Var(); } var keyword does not work on return type in a method

    private static Var getVarObject(){
        return new Var();
    }
}
