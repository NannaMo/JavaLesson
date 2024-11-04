package Examples;

import java.sql.SQLOutput;

public class Addition {
    public static void main(String[] args) {
        int a = 19;
        int b = 5;
        int c = add(a,b);
        System.out.println("The sum of a and b is = " + c);
        show();
    }

    public static int add(int n1, int n2){
        int s = n1+n2;
        return s;
    }

    static void show() {
        System.out.println("This is an example of the static method");
    }
}
