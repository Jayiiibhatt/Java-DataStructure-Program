class TransposeMatrix {
  public static void main(String args[]) {
    int[][] arr = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    int[][] arr2 = new int[3][3];
    System.out.println("Before Transpose Matrix : ");
    printArray(arr);

    for(int i=0; i<arr.length; i++) {
      for(int j=0; j<arr.length; j++) {
        arr2[j][i] = arr[i][j];
      }
    }
    System.out.println("After Transpose Matrix : ");
    printArray(arr2);


  }

  static void printArray(int[][] arr) {
    for(int i=0; i<arr.length; i++) {
      for(int j=0; j<arr.length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
