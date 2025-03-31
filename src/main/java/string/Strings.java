package string;

public class Strings {
    public static void main(String[] args) {
        internedStrings();
        heapStrings();
        internedAndHeapString();
        memoryAllocation();
        compilation();
        lexicalCompare();
        reverse("hello");
        format("Sujan", 30);
        textBlock();
        errorTextBlock();
        indentTextBlock();
    }

    private static void internedStrings(){
        String internedStringA = "String";
        String internedStringB = "String";
        boolean trueRef = internedStringA == internedStringB; // Fast comparison if compared on interned strings
        boolean trueEqualValue = internedStringA.equals(internedStringB);
        System.out.println(trueRef);
        System.out.println(trueEqualValue);
    }

    private static void heapStrings(){
        String heapStringA = new String("String");
        String heapStringB = new String("String");
        String heapRefA = heapStringA;
        boolean falseRef = heapStringA == heapStringB;
        boolean trueRef = heapStringA == heapRefA;
        boolean trueValue = heapStringA.equals(heapStringB);
        System.out.println(falseRef);
        System.out.println(trueRef);
        System.out.println(trueValue);
    }

    private static void internedAndHeapString(){
        String internedString = "String";
        String heapString = new String("String");
        boolean falseRef = internedString == heapString;
        boolean trueEqualValue = internedString.equals(heapString);
        System.out.println(falseRef);
        System.out.println(trueEqualValue);
    }

    private static void memoryAllocation(){
        String newInternA = "InternA";
        String newInternB = "InternB";
        String noNewInternA = "InternA";

        String newHeapA = new String("HeapA");
        String newHeapB = new String("HeapB");
        String differentNewHeapA = new String("HeapA");

        String oneNewIntern = "Three" + " New Intern";
        String singleHeapString = new StringBuilder("Single")
                .append("Heap")
                .append("String")
                .toString();
    }

    private static void compilation(){
        String aplus1 = "a" + 1;
        String a1 = "a1";
         /*
         * After compilation
         * String aplus1 = "a1";
         * String a1 = "a1";
         * */
    }

    private static void lexicalCompare(){
        String a = "a";
        String b = "b";
        System.out.println(a.compareTo(b)); // -1 means smaller, 0 means same, 1 means greater
    }

    private static void reverse(String original){
        System.out.println(new StringBuilder(original).reverse());
    }

    private static void format(String name, int age){
        System.out.println(String.format("Your name is %s. Your age is %d", name, age));
    }

    private static void textBlock(){
        String textBlock = """
                This is a text block.
                Which can be written this way.
                It is readable than traditional concatenated String.
                """;
        System.out.println(textBlock);
    }

    private static void errorTextBlock(){
        // String errorTextBlock = """ERROR""";
        /*
        * String errorTextBlock = """ERROR
        * """;
        *
        * First portion must be left with """ only.
        */
    }

    private static void indentTextBlock(){
        String indentTextBlock = """
                Hello
                Hello
                """.indent(1);
        System.out.println(indentTextBlock);
    }
}
