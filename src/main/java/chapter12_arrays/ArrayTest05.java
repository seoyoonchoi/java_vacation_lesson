package chapter12_arrays;

import java.util.Arrays;

public class ArrayTest05 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4},{5,6}};//int[3][2]
//        System.out.println(arr1);
//        System.out.println(arr1[0][0]);
//        System.out.println(arr1[1][1]);
//        System.out.println(arr1[2][0]);
//        for(int i = 0;i<arr1.length;i++){
//            System.out.print("\n");
//            for(int j = 0;j<arr1[i].length;j++){
//                System.out.print(arr1[i][j]);
//            }
//        }
        //윈도우+. 은 임티가 나온다.

//       for(int i =0;i<arr1.length;i++){
//           System.out.println(arr1[i]);
//           for(int j = 0;j<arr1[i].length;j++){
//               System.out.println(arr1[i][j]);
//               System.out.println();
//           }
//       }
        //arrays.toString은 1차원 배열만 추출된다
        //다차원 배열 Arrays.deepToString

        for(int[] arr : arr1){
            System.out.println(arr);
            //enhanced for문에서 중요한 점은 배열 내부의 element의 data type가 뭔지가 제일 중요하다. 지금의 경우 배열 내부의 element가
            //배열이기 때문에 []를 명시하여 작성한다.
            for(int element  : arr){
                System.out.print(element);
            }
            //이 코드를 실행해보면 element 값이 아니라 나머지 주소값이 출력되는 것을 볼 수 있다.
            System.out.println(Arrays.deepToString(arr1));

        }





    }
}
