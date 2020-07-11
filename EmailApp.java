import java.util.*;

public class EmailApp {
  Scanner scanner = new Scanner(System.in);
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private int mailBoxCapacity = 10;
  private String alternatePassword;
  private String email;

  public EmailApp(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = setDepartment();
    this.password = generatePassword(8);
    this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@Decagon.com";

    System.out.println("Your Email is "+ this.email);
    System.out.println("Your Password is "+ this.password);

    userPassword();
  }

  private String setDepartment(){
    System.out.println("Departments:\n1 -> FrontEnd\n2 -> BackEnd\n3 -> DevOps");
    System.out.println();
    System.out.print("Enter your department code: ");
    // System.out.println();
    int code = scanner.nextInt();

    if(code == 1) {
      return "FrontEnd";
    }else if(code == 2) {
      return "BackEnd";
    }else if(code == 3) {
      return "DevOps";
    }else {
      return "INVALID ENTRY";
    }
  }

  private String generatePassword(int len) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890*&$#?";
    char[] password = new char[len];

   for(int i = 0; i < len; i++) {
     int index = (int) (Math.random() * passwordSet.length());
    password[i] = passwordSet.charAt(index);
   }
   return new String(password);
  }

  public void showDetails() {
    System.out.println("------------------------------------------------");
    System.out.println(this.firstName+", Your Email Details:");
    System.out.println("------------------------------------------------");
    System.out.println("Your New Email is "+ this.email);
    System.out.println("Your New Password is "+ this.password);
    System.out.println("Selected Department: "+this.department);
    System.out.println("Your mail capacity is "+this.mailBoxCapacity+"gb");
    System.out.println();
  }

private void userPassword() {
  System.out.print("Would you like to change this Password: YES/NO: ");
  String choice = scanner.next();

  switch(choice.toLowerCase()) {
    case "yes":
      System.out.print("Enter new password: ");
      String newpass = scanner.next();
      this.password = newpass;
      System.out.println("Password changed successfully!");
      System.out.println();
      break;
    case "no":
      System.out.println();
      break;
    default:
      System.out.println("Invalid entry, default password set!!");
      System.out.println();
      break;
  }
}

}

// JustJavaIt...