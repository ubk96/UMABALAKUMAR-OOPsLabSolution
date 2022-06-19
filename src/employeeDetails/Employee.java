package employeeDetails;

import java.util.Random;

public class Employee {
	 String firstName = "harshit";
	   String lastName = "choudary";
	   String exten = ".abc.com";
	   public String mail;
	   public String password;
	   public int len = 8;

	   public void generatePassword() {
	      String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
	      Random rnd = new Random();
	      StringBuilder sb = new StringBuilder(this.len);

	      for(int i = 0; i < this.len; ++i) {
	         sb.append(chars.charAt(rnd.nextInt(chars.length())));
	      }

	      this.password = sb.toString();
	   }

	   public void generateEmailAddress(String dept) {
	      this.mail = this.firstName + this.lastName + '@' + dept + this.exten;
	   }

	   public void showCredentials() {
	      System.out.printf("\nDear %3s your generated credentials are as follows", this.firstName);
	      System.out.printf("\nEmail    --> %s", this.mail);
	      System.out.println("\nPassword--> " + this.password);
	   }

	   public void Technical(String inputDept) {
	      this.generateEmailAddress(inputDept);
	      this.generatePassword();
	      this.showCredentials();
	   }

	   public void Admin(String inputDept) {
	      this.generateEmailAddress(inputDept);
	      this.generatePassword();
	      this.showCredentials();
	   }

	   public void HumanResource(String inputDept) {
	      this.generateEmailAddress(inputDept);
	      this.generatePassword();
	      this.showCredentials();
	   }

	   public void Legal(String inputDept) {
	      this.generateEmailAddress(inputDept);
	      this.generatePassword();
	      this.showCredentials();
	   }
}

