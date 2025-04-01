package classes;

public class Records {

    private interface RecordInterface{}

    public record MyRecord(int age) implements RecordInterface{ // record can implement interface but cannot extend class
        MyRecord(){
            this(0);
        }

        public boolean canVote(){
            return age >= 18;
        }
    }

    public static void main(String[] args) {
        MyRecord recordOne = new MyRecord();
        MyRecord recordTwo = new MyRecord(0);
        MyRecord recordThree = new MyRecord(1);
        System.out.println(recordOne.equals(recordTwo));
        System.out.println(recordOne.equals(recordThree));

        System.out.println(recordOne.canVote());
        System.out.println(recordOne.age); //Since record is inner, its private field age is accessible, if record is external then we cannot access its field, only its method
        // recordOne.age = 5; Compiler Error, record field are final making immutable
    }
}
