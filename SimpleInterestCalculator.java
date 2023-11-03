public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 100000; // Initial deposit amount in Rwandan Francs
        double rate = 5; // Annual interest rate in percentage
        int time = 5; // Number of years

        BankAccount account = new BankAccount(principal, rate, time);

        double simpleInterest = account.calculateSimpleInterest();

        System.out.println("Mr. Bob's Simple Interest after " + time + " years is: " + simpleInterest + " Rwandan Francs");
    }
}
