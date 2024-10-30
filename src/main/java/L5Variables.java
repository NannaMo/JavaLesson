public class L5Variables {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        byte b = 10;
        short s = 200;
        int i = b + 23;
        long myLongValue = 456_789L;

        float myFloatValue = 23.56f;
        double myDoubleValue = 56.89d;

        double sum = i + b + s + myDoubleValue + myFloatValue + myLongValue;
        System.out.println("SUM = " + sum);

        float floatResult = myFloatValue / 2;
        System.out.println("floatResult = " + floatResult);
        double myNewDouble = 23.56;

        double myDoubleResult = myNewDouble / 3;
        System.out.println("myDoubleResult = " + myDoubleResult);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n'; // цей символ означає перенос строчки
        char char4 = '|';

        char char5 = '\u00A9';

        System.out.println("Characters:");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);
        System.out.println();

        System.out.println("SUM of Characters:");
        System.out.println(char1 + char2 + char3 + char4 + char5);

        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);

        boolean b1 = true;
        boolean b2 = false;

        String st = "some string" + " some other string";
        System.out.println(st);
    }
}
