package book.array;

import java.util.Arrays;
import java.util.TreeSet;

public class arrayTest {
    /**
     * 프로그래머스 문제 두 개 뽑아서 더하기
     * @param arr
     * @return
     */
    public static int[] pickTwoNumberAllSum(int[] arr){
        TreeSet treeSet = new TreeSet<Integer>();
        int length = arr.length;
        for(int i=0;i<=length-1;i++){
            for(int j=1+i;j<=length-1;j++){
                treeSet.add(arr[i]+arr[j]);
            }
        }

        int[] result = new int[treeSet.size()];

        for(int i=0;i<result.length;i++){
            result[i] = (int)treeSet.pollFirst();
        }

        return result;
    }

//    public static int[] exam (int[] arr){
//
//    }
}
