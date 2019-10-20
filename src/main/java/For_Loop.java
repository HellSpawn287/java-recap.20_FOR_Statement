public class For_Loop {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " +
                String.format("%.2f", calculateInterest(10000.0, 2.0)));
        System.out.println("10,000 at 3% interest = " +
                String.format("%.2f", calculateInterest(10000.0, 3.0)));
        System.out.println("10,000 at 4% interest = " +
                String.format("%.2f", calculateInterest(10000.0, 4.0)));
        System.out.println("10,000 at 5% interest = " +
                String.format("%.2f", calculateInterest(10000.0, 5.0)));

        for (int i = 2; i <= 8; i++) {
            double d = (double) i;
            System.out.println("10,000 at " + d + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, d)));

        }
        System.out.println("\n");
        for (int i = 8; i >= 2; i--) {
            double d = (double) i;
            System.out.println("10,000 at " + d + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, d)));

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
