public class CreditPaymentService {
    public static final double loanRate = 9.99/12/100;
    public static int monthlyPayment;

    public static int calculate (int creditSum, int months) {
        return monthlyPayment = (int)(creditSum * ((loanRate*Math.pow((1+loanRate), months))
                / (Math.pow(1+loanRate,months)-1)));
    }
}

