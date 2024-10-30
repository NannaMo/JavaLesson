public class L13Methods2 {
    public static void main(String[] args) {
        printMessage("Anna");

        calcRectangleSquare(5,10);
         /* або!!!
         int a = 5;
         int b = 10;
         calcRectangleSquare(a,b);
          */
    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static void calcRectangleSquare(int x, int y) {
        int square = x * y;
        System.out.println("Rectangle square = " + square);
    }

}
