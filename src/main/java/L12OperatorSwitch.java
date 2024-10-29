public class L12OperatorSwitch {
    public static void main(String[] args) {
       /* int choice = 5;
        switch (choice) {
            case 1:
                System.out.println("You choose 1");
                break;
            case 2:
                System.out.println("You choose 2");
                break;
            case 3:
                System.out.println("You choose 3");
                break;
            case 4:
                System.out.println("You choose 4");
                break;
            default:
                System.out.println("Unsupported option");
        }
        System.out.println("Final string"); */

        String dayOfTheWeek = "monday";
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("This is the first working day");
                break;
            case "tuesday":
                System.out.println("This is the second working day");
                break;
            case "wednesday":
                System.out.println("This is the third working day");
                break;
            case "thursday":
                System.out.println("This is the fourth working day");
                break;
            case "friday":
                System.out.println("This is the fifth working day");
                break;
            case "saturday": case "sunday":
                System.out.println("Finally weekend");
                break;

            default:
                System.out.println("Not a day of the week");
        }
    }
}
