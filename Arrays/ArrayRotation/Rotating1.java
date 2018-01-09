class Rotating1 {
  public static void main(String args[]) {
    Rotating1 rotate = new Rotating1();
    int[] arr = {1,2,3,4,5,6,7};
    System.out.print("Before : ");
    rotate.printArray(arr, 7);
    rotate.leftRotate(arr, 2, 7);
    System.out.print("After : ");
    rotate.printArray(arr, 7);
  }

  void leftRotate(int[] arr,int d,int n) {
    for(int i=0; i<d; i++) {
      leftRotateByOne(arr, n);
    }
  }

  void leftRotateByOne(int[] arr,int n) {
    int i, temp;
    temp = arr[0];
    for(i=0; i<n-1; i++) {
      arr[i] = arr[i+1];
    }
    // System.out.println("value of i is :"+i+" temp : "+temp);
    arr[i] = temp;
    // printArray(arr,7);
  }

  void printArray(int[] arr,int size) {
    int i;
    for(i=0 ; i<size; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}
