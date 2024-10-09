import codeUp.*;

import java.util.Arrays;

import static book.array.arraySort01.*;
import static book.array.arraySort02.arraySort2UseTreeSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,3,3,2,1};
        int[] sortArr = arraySort2UseTreeSet(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArr));
    }
}