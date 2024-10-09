package book.array;

import java.sql.Array;
import java.util.Arrays;

public class arraySort01 {
    /**
     * param 으로 받은 배열의 내용을 sort
     * @param arr
     * @return
     */
    public static int[] arraySort1(int[] arr){
        Arrays.sort(arr);
        return arr;
    };

    /**
     * 기존 배열에다가 sort 하지말고 clone 하여 sort [시간복잡도 : NlogN]
     * @param arr
     * @return
     */
    public static int[] arraySort1Clone(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }

    /**
     * sort 를 사용하지 않고 정렬 [시간복잡도 : O(n^2)]
     * @param arr
     * @return
     */
    public static int[] arraySortNotUseSort(int[] arr){
        int[] clone = arr.clone();
        int length = clone.length;

        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                int temp;
                if(clone[j]>clone[j+1]) {
                    temp = clone[j];
                    clone[j] = clone[j+1];
                    clone[j+1] = temp;
                }
            }
        }
        return clone;
    }
}
