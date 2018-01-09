class SumTriangle {
  static int[] arr = {4,7,3,6,7};

  public static void main(String args[]) {
    sumTringle();
  }

  static void sumTringle() {
    int n = arr.length;
    int[][] temp = new int[n][n];

    //this loop for fill last raw only which is same as array..
    for(int j=0;j<n;j++) {
      temp[n-1][j] = arr[j];
    }
    //this is loop is for fill second last raw and above all...
    for(int i=n-2;i>=0;i--) {
      for(int j=0;j<=i;j++) {
        temp[i][j] = temp[i+1][j]+temp[i+1][j+1];
      }
    }

    for(int i=0;i<n;i++) {
      for(int j=0;j<=i;j++) {
        System.out.print(temp[i][j]+" ");
      }
      System.out.println();
    }
  }
}
