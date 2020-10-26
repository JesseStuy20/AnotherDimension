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

  public static int[] sumRows(int[][] matrix) {
    int[] result = new int[matrix.length] ;
    for (int i = 0; i < matrix.length; i++) {
      result[i] = (ArrayOps.sum(matrix[i])) ;
    }
    return result ;
  }

  public static int[] largestInRows(int[][] matrix) {
    int [] result = new int[matrix.length] ;
    for (int i = 0; i < matrix.length; i++) {
      result[i] = (ArrayOps.largest(matrix[i])) ;
    }
    return result ;
  }

}
