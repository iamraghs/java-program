public class rotate1
{

  void leftarry(int arr[], int d)
  {
    if (d == 0) {
        return;
    }
    else {
      int n = arr.length;
      reverseArry(arr,0,d-1);
      reverseArry(arr,d,n-1);
      reverseArry(arr,0,n-1);
    }


  }

  void reverseArry(int arr[], int start, int end)
  {
    int temp;
    while (start  < end ) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

  }

  void printarry(int arr[])
  {
    for (int i=0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }

  }

  public static void main(String args[])
  {
      rotate1 rotate = new rotate1();
      int arr[] = {1,2,3,4,5,6,7,8,9};
      int d=2;
      int n = arr.length;
      d = d%n;
      rotate.leftarry(arr, d);
      rotate.printarry(arr);
  }
}
