import employeeDetails.Employee;
import java.util.Scanner;

public class creatingcredentials {
   public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
			Employee emp = new Employee();
            System.out.println("\nPlease enter the department from the following");
            System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n");
            int ch = sc.nextInt();
            String department;
            switch(ch) {
            case 1:
               department = "tech";
               emp.Technical(department);
               break;
            case 2:
               department = "admin";
               emp.Admin(department);
               break;
            case 3:
               department = "hr";
               emp.HumanResource(department);
               break;
            case 4:
               department = "legal";
               emp.Legal(department);
            }
		}
     } 
}
