class Arrayrotate {

  void leftrotate(int arr[], int d,int n ){

    for (int i=0;i < d;i++) {
      leftrotatebyone(arr,n);

    }
  }

  void leftrotatebyone(int arr[],int n){

    int i,temp;
    temp = arr[n-1];
    for (i=n-1; i >= 1; i--) {
      arr[i]=arr[i-1];

    }
    arr[i]=temp;
  }



    void printarray(int arr[],int n){

      for (int i=0; i < n; i++) {
        System.out.print(arr[i] + " ");


      }
    }



   public static void main(String[] args) {

     Arrayrotate rott = new Arrayrotate();
     int arr[]={1,2,3,4,5,6,7,8,9};
     rott.leftrotate(arr,2,9);
     rott.printarray(arr,9);




   }


}
