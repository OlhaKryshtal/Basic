package basic;

import java.util.Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};
        for (int j = 0; j < i.length; j++) {
            System.out.println(j);
// Show length of array
        }
        System.out.println(Arrays.toString(i));
//        Array will be written as String in one line

        int[] j = new int[5];
        System.out.println(Arrays.toString(j));
//        Array will show numbers of objects as 0,0,0,0,0

        for (int k = 0; k < i.length; k++) {
            System.out.print(i[k] + " ");
        }
//        1,2,3,4,5
        System.out.println();
        for (int k = i.length - 1; k >= 0; k--) {
            System.out.print(i[k] + " ");
        }
//        5,4,3,2,1
        System.out.println();

        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
    for (int i1 = 0; i1 < a.length; i1++){
        for ( int m = 0; m <a[i1].length ; m++){
            System.out.println(a[i1][m]);
        }
    }
//        Write all objects from arrays
    }
}
