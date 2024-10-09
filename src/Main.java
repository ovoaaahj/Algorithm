import codeUp.*;

import java.util.Arrays;

import static book.array.arraySort01.*;
import static book.array.arraySort02.arraySort2;
import static book.array.arraySort02.arraySort2UseTreeSet;
import static book.array.arrayTest.pickTwoNumberAllSum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1};
        int[] sortArr = pickTwoNumberAllSum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArr));
    }
}