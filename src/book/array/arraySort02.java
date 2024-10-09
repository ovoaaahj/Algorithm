package book.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class arraySort02 {
    /**
     * 배열의 중복을 제거하고 내림차순으로 정렬 자바 컬렉션 사용
     * @param arr
     * @return
     */
    public static int[] arraySort2(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[] :: new);
        Arrays.sort(result, Collections.reverseOrder());

        return Arrays.stream(result).mapToInt(Integer ::intValue).toArray();
    }

    public static int[] arraySort2UseTreeSet(int[] arr){
        TreeSet treeSet = new TreeSet<Integer>();
        for(int i : arr){
            treeSet.add(i);
        }

        int[] result = new int[treeSet.size()];
        for(int i = 0 ;i<result.length;i++){
            result[i] = (int) treeSet.pollFirst();
        }
        return result;

    }
}
