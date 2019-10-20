public class PrimeNumber {

    public static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
//            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
            for (int n = 2; n < 500; n++) {
                if (isPrimeNumber(n)) {
                    count = count + 1;
                    System.out.println("#"+count + "\tNumber " + n + " is a prime number");
                    if (count == 50) {
                        System.out.println("Breaking the loop...");
                        break;
                    }
                }
            }

    }
}
