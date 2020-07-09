class maxallsub
{
  void allsubarray(int arr[])
  {
    int i,product=1;
    int n = arr.length;
    for (i =0; i<n; i++ ) {
      for(int j=i; j < n; j++)
      {
        for (int k = i; k <= j; k++)
        {
          product *= arr[j];
        }
      }

    }
    System.out.println("max All sub array is " + product );

  }
  public static void main(String args[])
  {
    maxallsub max = new maxallsub();
    int arr[] ={ 10, 3, 7};
    max.allsubarray(arr);

  }
}
