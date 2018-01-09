class MaxNumInArray {
  public static void main(String args[]) {
    int[] arr = {5,9,5,20,8};
    MaxNumInArray a = new MaxNumInArray();
    int max = a.getMaxNumber(arr);
    System.out.println("Max number is : "+max);
  }

  int getMaxNumber(int[] arr) {
    int i, max=0;
    for(i=0; i<arr.length; i++) {
      if(arr[i]>max) {
        max = arr[i];
      }
    }
    return max;
  }
}
