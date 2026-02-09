import java.util.*;

class BillGenerator {
    void generateBill(int total) {
        System.out.println("Final Bill Amount: " + total);
    }

    void generateBill(int total, int dis) {
        int finalAmt = total - dis;
        System.out.println("Final Bill Amount: " + finalAmt);
    }

    void generateBill(int total, double per) {
        double disAmt = (total * per) / 100;
        double finalAmt = total - disAmt;
        System.out.println("Final Bill Amount: " + finalAmt);
    }
}

public class Mall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        System.out.print("Enter Item Total: ");
        int t = sc.nextInt();

        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");
        System.out.print("Select Type (1-3): ");
        int ch = sc.nextInt();

        switch(ch) {
            case 3:
                System.out.print("Enter Discount %: ");
                double p = sc.nextDouble();
                bg.generateBill(t, p);
                break;

            case 2:
                System.out.print("Enter Flat Discount (Rs): ");
                int d = sc.nextInt();
                bg.generateBill(t, d);
                break;

            case 1:
                bg.generateBill(t);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}