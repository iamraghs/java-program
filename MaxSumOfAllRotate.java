class MaxSumOfAllRotate
{

  static int maxsum(int arr[], int n)
  {
    int res = Integer.MIN_VALUE;



    for (int i=0; i < n; i++ ) {
      int cur_sum = 0;

      for (int j=0; j < n; j++ ) {
        int index = (i + j) % n;
        cur_sum += j * arr[index];

      }
      res = Math.max(res,cur_sum);
    }
    return res;
  }


  public static void main(String[] args) {
    int arr[] = {8,3,1,2};
    int n = arr.length;
    System.out.println(maxsum(arr,n));

  }
}
