import java.io.*;
import java.util.Scanner;

class StackAppDemo {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Max Size for Stack");
    int n = sc.nextInt();
    StackAlgorithm stack = new StackAlgorithm(n);
    int condition = 1;
    while(condition >=1 && condition <5) {
      System.out.println("1 for push element");
      System.out.println("2 for pop element");
      System.out.println("3 for peep element");
      System.out.println("4 for get pointer");
      System.out.println("5 for exit");
      System.out.println("*********************************");
      System.out.println("**********enter ur choice********");
      System.out.println("*********************************");
      condition = sc.nextInt();
      switch(condition) {
        case 1: {
          System.out.println("You Enter 1 Choce.");
          break;
        }
        case 2 : {
          System.out.println("You Enter 2 Choce.");
          break;
        }
        case 3 : {
          System.out.println("You Enter 3 Choce.");
          break;
        }
        case 4 : {
          System.out.println("You Enter 4 Choce.");
          break;
        }
        case 5 : {
          System.out.println("You Enter 5 Choce.");
          break;
        }
        default : {
          System.out.println("You Enter Wrong Choce.");
          break;
        }
      }
    }
  }
}
