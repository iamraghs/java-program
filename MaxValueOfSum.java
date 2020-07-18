class MaxValueOfSum
{
  static int arr[] = {1,20,2,10};

  static void maxsum()
  {

    int totalsum = 0;
    int arrsum =0;
    for (int i = 0; i < arr.length; i++) {
      arrsum = arrsum + arr[i];
      totalsum = totalsum + ( i * arr[i]);
    }

    int maxvalue = totalsum;
    for (int j =1; j < arr.length; j++ ) {

      totalsum = totalsum + arrsum - arr.length * arr[arr.length-j];
      if (totalsum > maxvalue){
        maxvalue = totalsum;
      }
    }
    
    System.out.println("The maximum sum is " + maxvalue);

  }



  public static void main(String[] args) {

  maxsum();
  }
}
