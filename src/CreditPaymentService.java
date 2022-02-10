public class CreditPaymentService {
    public static final double loanRate = 1 + 9.99/100;

    public static int calculate (int creditSum, int time) {
        double rate = countRate(time);
        double credit = creditSum * rate;
        int monthlyPayment = (int)credit/time;
        return monthlyPayment;
    }

    private static double countRate(int time) {
        double rate = 1 + 16.1432/100;

        if (time <= 12) {
            rate = 1 + 5.4932/100;
        } else if (time <=24) {
            rate = 1 + 10.736/100;
        }

        return rate;
    }
}
