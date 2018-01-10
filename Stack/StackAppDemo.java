import java.io.*;
import java.util.Scanner;

class StackAppDemo {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Max Size for Stack");
    int n = sc.nextInt();
    StackAlgorithm stack = new StackAlgorithm(n);
    int condition = 1;
    while(condition != 5) {
      System.out.println("1 --- push element");
      System.out.println("2 --- pop element");
      System.out.println("3 --- peep element");
      System.out.println("4 --- get pointer");
      System.out.println("5 --- exit");
      System.out.println("**enter ur choice**");
      condition = sc.nextInt();

      switch(condition) {
        case 1: {
          System.out.println("*********************************");
          System.out.println("Enter number for push into Stack");
          int a = sc.nextInt();
          int ele = stack.push(a);
          if(ele == a) {
            System.out.println("You have Push element : "+ele+" Stack pointer is : "+stack.getPointer());
          } else {
            System.out.println("Stack Is Overflow.");
          }
          break;
        }
        case 2 : {
          System.out.println("*********************************");
          if(stack.isEmpty()) {
            System.out.println("Stack Is Underflow,No more element is there in Stack.");
          } else {
            int ele = stack.pop();
            System.out.println("You have pop the element : "+ele);
          }
          break;
        }
        case 3 : {
          System.out.println("*********************************");
          System.out.println("You Enter 3 Choce.");
          break;
        }
        case 4 : {
          System.out.println("*********************************");
          System.out.println("Pointer is on : "+stack.getPointer());
          break;
        }
        case 5 : {
          System.out.println("*********************************");
          System.out.println("You are exit from this stack App.");
          break;
        }
        default : {
          System.out.println("*********************************");
          System.out.println("You Enter Wrong Choce.");
          break;
        }
      }
      System.out.println("*********************************");
    }
  }
}
