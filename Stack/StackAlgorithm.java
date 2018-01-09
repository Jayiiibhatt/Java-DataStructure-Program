public class StackAlgorithm {
  int[] head;
  int pointer;

  public StackAlgorithm(int capacity) {
    head = new int[capacity];
    pointer = -1;
  }

  public boolean isEmpty() {
    return pointer == -1;
  }

  public void push(int element) {
    if(pointer+1 < head.length) {
      head[++pointer] = element;
      // return element;
    } else {
      System.out.println("Stack Is Overflow.");
    }
  }

  public int pop() {
    if(isEmpty()) {
      return 0;
    } else {
      return head[pointer--];
    }
  }
}
