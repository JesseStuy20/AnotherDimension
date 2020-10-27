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
    int[][] d = {{1,6,3,2,6},
                 {12,8,61,8,3,26}} ;
    int[][] e = {{8,42,51,6,60},
                 {9,2,7,41,5},
                 {7,1}} ;
    System.out.println("SumRows Tests") ;
    System.out.println(Arrays.toString(ArrayOps.sumRows(d))) ;
    System.out.println(Arrays.toString(ArrayOps.sumRows(e))) ;
    System.out.println("LargestInRows Tests") ;
    System.out.println(Arrays.toString(ArrayOps.largestInRows(d))) ;
    System.out.println(Arrays.toString(ArrayOps.largestInRows(e))) ;
    System.out.println("Sum Tests") ;
    System.out.println(ArrayOps.sum(d)) ;
    System.out.println(ArrayOps.sum(e)) ;
    int[][] f = {{6,18,7,2},
                 {4,8,11,9},
                 {6,1,7,15}} ;
    int[][] g = {{9,1,6},
                 {7,9,3},
                 {8,2,6},
                 {0,2,7},
                 {5,3,3}} ;
    System.out.println("SumCols Tests") ;
    System.out.println(Arrays.toString(ArrayOps.sumCols(f))) ;
    System.out.println(Arrays.toString(ArrayOps.sumCols(g))) ;
    int[][] h = {{1,2,3,4},
                 {2,3,4,1},
                 {3,4,1,2}} ;
    int[][] i = {{1,1,1},
                 {2,2,2},
                 {3,3,3}} ;
    int[][] j = {{2,2,2},
                 {2,2,2}} ;
    System.out.println("isRowMagic Tests") ;
    System.out.println(ArrayOps.isRowMagic(h)) ;
    System.out.println(ArrayOps.isRowMagic(i)) ;
    System.out.println(ArrayOps.isRowMagic(j)) ;
    System.out.println("isColMagic Tests") ;
    System.out.println(ArrayOps.isColMagic(h)) ;
    System.out.println(ArrayOps.isColMagic(i)) ;
    System.out.println(ArrayOps.isColMagic(j)) ;
  }

}
