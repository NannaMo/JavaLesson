public class L7Operators {
    public static void main(String[] args) {
//      + - / * %
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;
        double g = a % b;

        System.out.println("Додавання = " + c);
        System.out.println("Віднімання = " + d);
        System.out.println("Множення = " + e);
        System.out.println("Ділення = " + f);
        System.out.println("Остача = " + g);

        a = a + 5; // або те саме: a += 5
        System.out.println("New a = " + a);

        a = a + 1;
        // або a += 1 ; або a++
        System.out.println("New a = " + a);

        b--;
        System.out.println("New b = " + b);

        // a++ та ++a - це різні записи

        double n = 7;
        double m = 7;

        double res1 = 2 * n++; // в цьому випадку тільки множиться на 2, присвоюється результат, а потім ++ (яке нікуди не йде)
        double res2 = 2 * ++m; // в цьому випадку спочатку додається ++, а потім виконується множення та присвоєння результату

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);


    }
}
