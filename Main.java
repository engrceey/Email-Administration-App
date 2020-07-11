import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter First Name: ");
    String firstName = scanner.nextLine();

    System.out.print("Enter Last Name: ");
    String lastName = scanner.nextLine();

    EmailApp obj = new EmailApp(firstName,lastName);
    obj.showDetails();
    
    
  }
}