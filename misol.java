import java.util.Scanner;

public class misol {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Yes or No?");
    String str = scan.next();
    int i = scan.nextInt();
    scan.close();
    System.out.println(str + i);

  }
}