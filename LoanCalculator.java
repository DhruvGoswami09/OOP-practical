import java.util.Scanner;

public class LoanCalculator {

    public void calculateEMI(int p, int t, float r) {
        double i = (p * r * t) / 100.0;
        double ans = (p + i) / (t * 12);
        System.out.println("interest amount: " + i);
        System.out.println("home loan emi: " + ans);
    }

    public void calculateEMI(double p, int t, double r) {
        double i = (p * r * t) / 100.0;
        double ans = (p + i) / (t * 12);
        System.out.println("interest amount: " + i);
        System.out.println("vehicle loan emi: " + ans);
    }

    public void calculateEMI(int p, int t) {
        double i = (p * 10.0 * t) / 100.0;
        double ans = (p + i) / (t * 12);
        System.out.println("interest amount: " + i);
        System.out.println("personal loan emi: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanCalculator obj = new LoanCalculator();
        
        System.out.println("home loan");
        System.out.print("principal amount : ");
        int p1 = sc.nextInt();
        System.out.print("time duration in years : ");
        int t1 = sc.nextInt();
        System.out.print("rate (%) : ");
        float r1 = sc.nextFloat();
        obj.calculateEMI(p1, t1, r1);
        
        System.out.println("\nvehicle loan");
        System.out.print("principal amount : ");
        double p2 = sc.nextDouble();
        System.out.print("time duration in years : ");
        int t2 = sc.nextInt();
        System.out.print("rate (%) : ");
        double r2 = sc.nextDouble();
        obj.calculateEMI(p2, t2, r2);
        
        System.out.println("\npersonal loan");
        System.out.print("principal amount : ");
        int p3 = sc.nextInt();
        System.out.print("time duration in years : ");
        int t3 = sc.nextInt();
        obj.calculateEMI(p3, t3);
    }
}
