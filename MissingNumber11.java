class MissingNumber11
{

  static int getMissingNum(int arr[] ,int n)
  {
    int i,totalsum,sum = 0;
    totalsum = n * (n + 1) / 2;
    for (i = 0; i < n-1; i++) {

      sum = sum + arr[i];
    }
    totalsum = totalsum - sum;
    return totalsum;
  }



  public static void main(String[] args) {
    int arr[] = {1,2,3,5,6,7,8};
    int miss = getMissingNum(arr, arr.length);
    System.out.println("The Missing Number is " + miss);

  }
}
