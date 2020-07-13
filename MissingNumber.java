class MissingNumber
{

  static int getMissingNum(int arr[], int n)
  {
    int total;
    total = (n+1) * (n+2) / 2;
    for (int i=0; i < n; i++) {
      total -= arr[i];

    }
    return total;
  }

  public static void main(String[] args) {
    MissingNumber missing = new MissingNumber();
    int arr[] = {1,2,3,4,5,7,8,9};
    int n = arr.length;

    int miss = getMissingNum(arr,n);
    System.out.println(" The missing number is " + miss);


  }

}
