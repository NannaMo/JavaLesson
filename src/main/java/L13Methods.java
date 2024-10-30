public class L13Methods {
    public static void main(String[] args) {
        printMessage("Anna");
        printMessage("John");
        printMessage("Mike");
        /*result:
        Hello Anna!!!
        Hello John!!!
        Hello Mike!!!
         */
    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }


}
