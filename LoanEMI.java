import java.util.*;

class LoanCalculator {
    // Home Loan EMI
    void calculateEMI(int principal, int months, float rate) {
        double r = rate / (12 * 100);
        double emi = (principal * r * Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1);
        System.out.println("Home Loan EMI: " + (int) emi);
    }

    // Vehicle Loan EMI
    void calculateEMI(double principal, int months, double rate) {
        double r = rate / (12 * 100);
        double emi = (principal * r * Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1);
        System.out.println("Vehicle Loan EMI: " + (int) emi);
    }

    // Personal Loan EMI (fixed 10% rate)
    void calculateEMI(int principal, int months) {
        double rate = 10.0;
        double r = rate / (12 * 100);
        double emi = (principal * r * Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1);
        System.out.println("Personal Loan EMI (10% fixed): " + (int) emi);
    }
}

public class LoanEMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanCalculator lc = new LoanCalculator();

        System.out.print("Enter loan type (1=Home, 2=Vehicle, 3=Personal): ");
        int type = sc.nextInt();

        System.out.print("Enter principal amount: ");
        double princ = sc.nextDouble();

        System.out.print("Enter time in months: ");
        int months = sc.nextInt();

        switch (type) {
            case 1:
                System.out.print("Enter home loan rate (%): ");
                float homeRate = sc.nextFloat();
                lc.calculateEMI((int) princ, months, homeRate);
                break;

            case 2:
                System.out.print("Enter vehicle loan rate (%): ");
                double vehRate = sc.nextDouble();
                lc.calculateEMI(princ, months, vehRate);
                break;

            case 3:
                lc.calculateEMI((int) princ, months);
                break;

            default:
                System.out.println("Invalid loan type!");
        }
    }
}