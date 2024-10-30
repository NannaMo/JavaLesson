public class L10OperatorWhileDo {
    public static void main(String[] args) {

        int finalBalance = 100000;
        double currentBalance = 0;
        int payment = 1000;
        int years = 0;
        double interestRate = 0.10;

     /*   while (currentBalance < finalBalance) {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        } */

       /* do {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        } while(currentBalance < finalBalance); // - умова */

        // різниця в тому, що в 2му випадку дія виконається хоча б раз, навіть, якщо умова false

        do {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        } while (currentBalance < finalBalance && years < 15);

    }
}
