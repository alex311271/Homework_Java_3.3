
import java.lang.Math;

public class CreditPaymentService {
    public double calculate(double sumCredit, double precentOnYear, double periodCredit) {

        double coefficientone = precentOnYear / 1200;
        double coefficienttwo = 1 + coefficientone;
        double coefficientPow = Math.pow(coefficienttwo, -periodCredit);
        double coefficientResult = 1 - coefficientPow;
        double monthlyPayment = (sumCredit * coefficientone) / coefficientResult;
        int monthlyPayments = (int) monthlyPayment;

        return monthlyPayments;

    }
}