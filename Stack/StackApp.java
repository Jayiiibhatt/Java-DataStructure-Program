import java.io.*;

class StackApp {
  public static void main(String[] args) {
    StackAlgorithm stack1 = new StackAlgorithm(10);
    System.out.println("starting....");
    for(int i=0; i<10; i++) {
      int j = (int) (Math.random() * 100);
      stack1.push(j);
      System.out.println("push : "+j);
    }

    while(!stack1.isEmpty()) {
      System.out.println("pop : "+stack1.pop());
    }
    System.out.println("End....");
  }
}
