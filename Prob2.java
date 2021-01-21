import java.util.Scanner;

class Prob2 {
  public static void main(String[] args) {

    Scannner scan = new Scanner(System.in);
    System.out.print("Enter a string");
    String h = scan.nextLine();

    System.out.println(h.substring(0,1));

    System.out.println(h.substring(h.length()-1));



  }
}