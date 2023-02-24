import java.util.Scanner;

public class PaymentValidation {
    public static void main(String[] args) {
        String[] acceptedPayments = {"credit card", "debit card", "cash","pix"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Payment methods: ");
        String payment = scanner.nextLine();

        if (isValidPayment(payment, acceptedPayments)) {
            System.out.println("Accepted payment method.");
        } else {
            System.out.println("Invalid payment method.");
        }
    }
    
    public static boolean isValidPayment(String payment, String[] acceptedPayments) {
        for (String acceptedPayment : acceptedPayments) {
            if (payment.equalsIgnoreCase(acceptedPayment)) {
                return true;
            }
        }
        return false;
    }
}
