public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;

        int monthlyPayment = service.calculate(creditSum, 1);

        int monthlyPayment2 = service.calculate(creditSum, 2);

        int monthlyPayment3 = service.calculate(creditSum, 3);

        System.out.println(monthlyPayment);
        System.out.println(monthlyPayment2);
        System.out.println(monthlyPayment3);
    }
}
