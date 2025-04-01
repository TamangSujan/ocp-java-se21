package advance.flow;

public class AdvanceSwitch {
    public static void main(String[] args) {
        System.out.println(getSwitchEnumString(SwitchEnum.ONE));
        System.out.println(getSwitchEnumStringWithCustomLogic(SwitchEnum.TWO));
        System.out.println(getPatternMatchingSwitch(1));
        System.out.println(getPatternMatchingSwitch("1"));
        System.out.println(switchHandlesNull(null));
        System.out.println(getPatternMatchingSwitch(null));
    }

    private static String getSwitchEnumString(SwitchEnum switchEnum){
        /*
        * All cases must be handled for enum
        * If not default must be provided
        */
        return switch(switchEnum){
            case ONE -> "One";
            case TWO -> "Two";
            default -> "Three";
        };
    }

    private static String getSwitchEnumStringWithCustomLogic(SwitchEnum switchEnum){
        /*
         * All cases must be handled for enum
         * If not default must be provided
         */
        return switch(switchEnum){
            case ONE -> "One";
            case TWO -> {
                System.out.println("Two was called");
                yield "Two";
            }
            default -> "Three";
        };
    }

    private static String getPatternMatchingSwitch(Object o){
        return switch (o){
            case Integer i when i > 0 -> "Positive Number";
            case String i -> {
                System.out.println("Calling String!");
                yield i;
            }
            default -> "Other objects";
        };
    }

    private static String switchHandlesNull(Object o){
        return switch (o) {
            case Integer i -> "Number";
            case String i -> "String";
            case null, default -> "Null or Default";
        };
    }
}
