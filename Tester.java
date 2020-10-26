import java.util.* ;
public class Tester {
  public static void main(String[] args) {
    int[] a = {1,6,3,2,6} ;
    int[] b = {12,8,61,8,3,26} ;
    int[] c = {73,1,7,5,2,8,3,100} ;
    System.out.println("Sum Tests") ;
    System.out.println(ArrayOps.sum(a)) ;
    System.out.println(ArrayOps.sum(b)) ;
    System.out.println(ArrayOps.sum(c)) ;
    System.out.println("Largest Tests") ;
    System.out.println(ArrayOps.largest(a)) ;
    System.out.println(ArrayOps.largest(b)) ;
    System.out.println(ArrayOps.largest(c)) ;
    int[][] d = {{1,6,3,2,6}, {12,8,61,8,3,26}} ;
    int[][] e = {{8,42,51,6,60}, {9,2,7,41,5}, {7,1}} ;
    System.out.println("SumRows Tests") ;
    System.out.println(Arrays.toString(ArrayOps.sumRows(d))) ;
    System.out.println(Arrays.toString(ArrayOps.sumRows(e))) ;
    System.out.println("LargestInRows Tests") ;
    System.out.println(Arrays.toString(ArrayOps.largestInRows(d))) ;
    System.out.println(Arrays.toString(ArrayOps.largestInRows(e))) ;
  }

}
