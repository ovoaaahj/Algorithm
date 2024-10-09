import codeUp.*;

import java.util.Arrays;

import static book.array.arraySort01.*;
import static book.array.arraySort02.arraySort2;
import static book.array.arraySort02.arraySort2UseTreeSet;
import static book.array.arrayTest.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,2};
        int[] sortArr = examCase2(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArr));
    }
}