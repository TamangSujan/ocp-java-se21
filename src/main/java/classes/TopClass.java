package classes;

public class TopClass {
    public static class StaticInnerMemberClass{}
    public interface StaticInnerMemberInterface{}
    public enum StaticInnerMemberEnum{}
    public record StaticInnerMemberRecord(){}
    public class InnerMemberClass{}

    public final StaticInnerMemberClass nonStaticFieldOfInnerStaticClass = new StaticInnerMemberClass();
    public final static StaticInnerMemberInterface staticFieldOfInterface = new StaticInnerMemberInterface() {}

    public void method(){
        class LocalClass{}
        LocalClass localClass = new LocalClass();
        interface LocalInterface{}
        LocalInterface localInterface = new LocalInterface() {};
        enum LocalEnum{}
        record LocalRecord(){}
        LocalRecord localRecord = new LocalRecord();
    }
}
