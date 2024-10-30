public class L6DataTypes {
    public static void main(String[] args) {

            System.out.println("Hello world!!!");

            byte b = 10;
            short s = 200;
            int i = b + 23;
            long myLongValue = 456_789L;

            float myFloatValue = 23.56f;
            double myDoubleValue = 56.89d;

            System.out.println("byte b = " + b);
            System.out.println("short s = " + s);
            System.out.println("int i = " + i);

            short someShort = b;
            System.out.println("someShort = " + someShort);

            int someInt = someShort;
            System.out.println("someInt = " + someInt);


            double someDouble = myFloatValue;
            double someIntToDouble = someInt;


    }

}
