package chapter12_arrays;

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        int num = 0;
        /*for(int i=0;i<5;i++){
            System.out.println();
            for(int j = 0; j<5; j++){
                numbers[i][j] = num+1;
//                System.out.print(numbers[i][j]);
                num++;

            }
        }*/
//        System.out.println(Arrays.deepToString(numbers));

        for(int i = 0; i<numbers.length;i++){
            for(int j = 0; j<numbers[i].length;j++){
                numbers[i][j] = ++num;
            }
        }
        System.out.println(Arrays.deepToString(numbers));
        //향상된 for 문의 주의할점. 향상된 for문은 기본적으로 배열의 요소를 읽기만 할수 있고 배열의 인덱스 접근 및 수정에서는 사용불가하다
//        특히 이상의 과제인 경우엔 직접적으로 인덱스 넘버를 사용해서 정해진 위치에 정해진 값을 대입해야 하기 때문에 인덱스를 명시할 수 없는 향상된
        // for문을 사용할 수 없습니다.

        for(int[] row : numbers){
            for(int number : row){
                System.out.println(number+" ");
            }
            System.out.println();
        }
    }
}
