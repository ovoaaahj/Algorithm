package book.array;

import java.util.*;

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

    /**
     * 프로그래머스 문제 : 모의고사
     * 처음으로 풀어본 버전
     * @param arr
     * @return
     */
    public static int[] exam (int[] arr){
        int[] firstMan = {1,2,3,4,5};
        int[] secondMan = {2,1,2,3,2,4,2,5};
        int[] thirdMan = {3,3,1,1,2,2,4,4,5,5};

        int length = arr.length;
        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;

        for(int i=0;i<=length-1;i++){
            if(arr[i]==firstMan[i%firstMan.length]) firstCount ++;
            if(arr[i]==secondMan[i%secondMan.length]) secondCount ++;
            if(arr[i]==thirdMan[i%thirdMan.length]) thirdCount ++;
        }

        int[] result = new int[1];

        if(firstCount>=secondCount){
            if(firstCount==secondCount){
                if(firstCount == thirdCount){
                    return new int[] {1,2,3};
                }else{
                    return new int[] {1,2};
                }
            } else if(firstCount>thirdCount){
                return new int[] {1};
            } else if(firstCount==thirdCount){
                return new int[] {1,3};
            }
        }else if(secondCount>=thirdCount){
          if(secondCount == thirdCount){
              return new int[] {2,3};
          }else{
              return new int[] {2};
          }
        }else{
            return new int[] {3};
        }

        return result;
    }


    /**
     * 프로그래머스 문제 : 모의고사
     * 다른 케이스 참고하여 수정한 버전
     * @param arr
     * @return
     */
    public static int[] examCase2 (int[] arr){
        int[] firstMan = {1,2,3,4,5};
        int[] secondMan = {2,1,2,3,2,4,2,5};
        int[] thirdMan = {3,3,1,1,2,2,4,4,5,5};

        int length = arr.length;
        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;

        for(int i=0;i<=length-1;i++){
            if(arr[i]==firstMan[i%firstMan.length]) firstCount ++;
            if(arr[i]==secondMan[i%secondMan.length]) secondCount ++;
            if(arr[i]==thirdMan[i%thirdMan.length]) thirdCount ++;
        }

        int maxCount = Math.max(firstCount, Math.max(secondCount, thirdCount));

        List<Integer> list = new ArrayList<>();
        if (firstCount == maxCount) list.add(1);
        if (secondCount == maxCount) list.add(2);
        if (thirdCount == maxCount) list.add(3);

        // 리턴 방법 1 stream을 활용하여 넘긴다. 보기엔 1번이 좋지만
//        return list.stream().mapToInt(i -> i).toArray();

        // 리턴 방법 2 직접 for문을 돌려 넣는다. 속도는 2번이 더 빠름
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;

        return answer;
    }

    public static int[][] matrixMultiplication(int[][] arr1 , int[][] arr2){
        int arr1oneSize = arr1.length;
        int arr1twoSize = arr1[0].length;
        int arr2twoSize = arr2[0].length;

        int[][] answer = new int[arr1oneSize][arr2twoSize];
        for(int i = 0; i<arr1oneSize;i++){
            for(int j=0;j<arr2twoSize;j++){
                for(int k=0;k<arr1twoSize;k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }

}
