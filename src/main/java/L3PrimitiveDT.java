public class L3PrimitiveDT {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 100000000000000L;
        long l3 = 51L;

        float f1 = 3.14f;
        float f2 = 2.5f;
        float f3 = 20;

        double d1 = 5.5;
        double d2 = 87.6523;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500; // 500й символ в ю системі Десяткова система

        char c6 = '\u0500'; // Шістнадцяткова система

        boolean bool1 = true;
        boolean bool2 = false;

        int a1 = 60; // Dec system Десяткова

        int a2 = 0B111100; // BIN system двійкова
        int a3 = 0b111100; //BIN system двійкова with b

        int a4 = 074; // Oct system Вісімкова, можна після 0 використовувати _. Тільки в цій системі.

        int a5 = 0x3C; // HEX system Шістнадцяткова
        int a6 = 0X3c; // HEX system Шістнадцяткова

        int a7 = 1_000_000; //Дозоляє андерскором _ ділити на тисячні...
        /* _ не можна використовувати до та після числа; до та після крапки; до та після літер l,L,f,F,d,D; до після та між 0Х, 0х, 0В, 0b */


        System.out.println(a6);
    }

}
