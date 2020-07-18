class SortedPairSum
{

  static boolean PairInSorted(int arr[], int n, int sum)
  {
    int i;
    for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i+1])
                break;

    int l = (i + 1) % n;
    int r = i;

    while (l != r) {
      if (arr[l] + arr[r] == sum) {

        return true;
      }

      if (arr[l] + arr[r] < sum) {
        l = (l + 1) % n;

      }
      if (arr[l] + arr[r] > sum) {
        r = (n + r - 1) % n;

      }

    }
    return false;

  }


  public static void main(String[] args) {
    int arr[] = {10,4,5,3,9};
    int sum = 29;
    int n = arr.length;

    if (PairInSorted(arr, n, sum)) {
      System.out.println("Array has two elements with sum " + sum);

    }
    else {
      System.out.println("Array doesnt have two elements with sum " + sum);
    }

  }
}
