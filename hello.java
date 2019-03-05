import java.util.Scanner;

public class hello {

  public static void main(String[] args) {
    int no_friends;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter values");
    no_friends = sc.nextInt();
    sc.close();2
    System.out.println("Value entered is" + no_friends);
  }
}