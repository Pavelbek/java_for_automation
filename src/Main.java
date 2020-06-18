public class Main {

    public static void main(String[] args) {
        byte myByte = 127; // -128 - 127
        short myShort = 32767; // -32768 - 32767
        int myInt = 32768;
        long myLong = 99999999999999L;

        double myDouble = 44.44;
        float myFloat = 44.44F;

        char myChar = 'f';

        boolean myBoolean = true;
        boolean myBooleanFalse = false;


        String myString = "some string";

        String myString2 = "secomnd string";


        Byte myBigByte = 22;
        Short mm = 234;
        Integer integer = 342134;

        myBigByte = 33;

        int ttt = new Integer(22);

        Test test = new Test();

        System.out.println(test.myByte);
        System.out.println(test);
    }

    public static void test(){
    }

}

class Test {
    public byte myByte = 44;
    private int myInt = 55;
    protected long myLong = 555L;
    final char myChar = 't';

    public static final String SOME_CONSTANT = "some string";
}
