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

  public static int sum(int[][] arr) {
    int result = 0 ;
    result = ArrayOps.sum(ArrayOps.sumRows(arr)) ;
    return result ;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] result = new int[matrix[0].length] ;
    for (int i = 0; i < matrix[0].length; i++) {
      result[i] = 0 ;
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        result[j] = (result[j] + matrix[i][j]) ;
      }
    }
    return result ;
  }

  public static boolean isRowMagic(int[][] matrix) {
    boolean result = true ;
    for (int i = 0; i < matrix.length-1; i++) {
      if (ArrayOps.sum(matrix[i]) != ArrayOps.sum(matrix[i+1])) {
        result = false ;
      }
    }
    return result ;
  }

}
