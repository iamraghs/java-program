class maxallsub2
{
  void allsubarray(int arr[],int n)
  {
    int product = 1;
    int res = 1;
    for(int i=0; i<n; i++) {
      int product = 1;
      for(int j = i; j<n ; j++) {
        product = product*arr[j];
        res *= product;

      }

    }
    System.out.print("product of all sub arry is " + res);

  }

  public static void main(String[] args) {

    maxallsub2 maxsub = new maxallsub2();

    int arr[] = {10,3,7};
    int n = arr.length;
    maxsub.allsubarray(arr,n);


  }


}
