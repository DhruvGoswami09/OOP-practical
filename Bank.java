import java.util.*;

class BankAccount {
    String AccId;
    String HolderName;
    double balance;
    
    void getV(String Id, String Name, double bal) {
        AccId = Id;
        HolderName = Name;
        balance = bal;
    }
    
    void display() {
        System.out.println("Acc No: " + AccId);
        System.out.println("Name: " + HolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BankAccount a[] = new BankAccount[5];
        
        for(int i=0; i<5; i++) {
            a[i] = new BankAccount();
        }
        
        a[0].getV("A1", "Dhruv", 80000);
        a[1].getV("A2", "Pratham", 70000);
        a[2].getV("A3", "Bhavin", 60000);
        a[3].getV("A4", "Parth", 40000);
        a[4].getV("A5", "Ansh", 30000);
        
        System.out.print("Enter account No: ");
        String s = sc.next();
        
        int f = 0;
        for(int i=0; i<5; i++) {
            if(a[i].AccId.equals(s)) {
                System.out.println("Found:");
                a[i].display();
                f = 1;
                break;
            }
        }
        
        if(f == 0) {
            System.out.println("Not found!");
        }
    }
}