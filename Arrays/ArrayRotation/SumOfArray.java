class SumOfArray {
  static int[] arr = {2,3,4,5,6};

  static int sum() {
    int i,sum=0;
    for(i=0;i<arr.length;i++) {
        sum = sum+arr[i];
    }
    return sum;
  }

  static int mul() {
    int i, mul=1;
    for(int a : arr) {
      mul = mul*a;
    }
    return mul;
  }

  public static void main(String args[]) {
    System.out.println("Sum of array is : "+sum());
    System.out.println("Mul of array is : "+mul());
  }
}
