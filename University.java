import java.util.Scanner;

class University {
    static int totalStudents = 0;
    static String universityName;
    
    static {
        universityName = "GTU University";
        System.out.println("Static block executed: " + universityName);
    }
    
    {
        totalStudents++;
        System.out.println("Instance block: Object created. Total students: " + totalStudents);
    }
    
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter university name: ");
        universityName = sc.nextLine();
        System.out.println("Updated university: " + universityName);
        
        System.out.print("How many students to create? ");
        int num = sc.nextInt();
        
        System.out.println("Total before: " + University.getTotalStudents());
        
        for(int i = 0; i < num; i++) {
            new University();
        }
        
        System.out.println("Final total: " + University.getTotalStudents());
    }
}