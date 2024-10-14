import codeUp.*;

import java.util.Arrays;

import static book.array.arraySort01.*;
import static book.array.arraySort02.arraySort2;
import static book.array.arraySort02.arraySort2UseTreeSet;
import static book.array.arrayTest.*;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{2,3,2},{4,2,4},{3,4,1}};
        int[][] arr2 =  {{5,4,3},{2,4,1},{3,1,1}};
        int[][] sortArr = matrixMultiplication(arr1,arr2);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArr));
    }
}