package pattern;

public class Instance {

    static class LocalCatClass{
        public String getSound(){
            return "Meow";
        }
    }

    static class LocalDogClass{
        public String getSound(){
            return "Woof";
        }
    }

    public static void main(String[] args) {
        printClass(new Instance.LocalCatClass());
        printClass(new Instance.LocalDogClass());
    }

    private static void printClass(Object o){
        if(o instanceof LocalCatClass cat){
            System.out.println(cat.getSound());
        }
        if(o instanceof LocalDogClass dog && dog.getSound().equals("Woof")){
            System.out.println(dog.getSound());
        }
    }
}
