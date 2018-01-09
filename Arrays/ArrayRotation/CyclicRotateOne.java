class CyclicRotateOne {
  static int[] arr = {2,3,4,5,1};
  static int[] rotateArray() {
    int i,temp;
    // System.out.println(arr[arr.length-1]);
    temp = arr[arr.length-1];
    for(i=arr.length-1;i>0;i--) {
      arr[i] = arr[i-1];
    }
    arr[0] = temp;
    return arr;
  }

  public static void main(String args[]) {
    System.out.println("After shifting");
    int[] arr1 = rotateArray();
    for(int i=0;i<arr1.length;i++) {
      System.out.print(" "+arr1[i]);
    }
    System.out.println();
  }
}
