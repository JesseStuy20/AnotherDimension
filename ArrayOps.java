public class ArrayOps {

  public static int sum(int[] arr) {
    int result = 0 ;
    for (int i = 0; i < arr.length; i++) {
      result = result + arr[i] ;
    }
    return result ;
  }

  public static int largest(int[] arr) {
    int result = 0 ;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > result) result = arr[i] ;
    }
    return result ;
  }

}
