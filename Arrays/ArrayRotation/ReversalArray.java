class ReversalArray {

  static int[] sendArrayForReverse(int[] arr, int d, int n) {
    for(int i=0; i<d; i++) {
      arr = reverseArray(arr, n);
    }
    return arr;
  }

  static int[] reverseArray(int[] arr, int sizeOfArr) {
    int temp,i;
    temp = arr[0];
    for(i=0 ;i<sizeOfArr-1 ;i++) {
      arr[i] = arr[i+1];
    }
    arr[sizeOfArr-1] = temp;
    return arr;
  }

  static void printArray(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int[] arr = {5,6,3,2,1,4};
    System.out.print("Before : ");
    printArray(arr);
    arr = sendArrayForReverse(arr, 2, arr.length);
    System.out.print("After : ");
    printArray(arr);

  }

}
