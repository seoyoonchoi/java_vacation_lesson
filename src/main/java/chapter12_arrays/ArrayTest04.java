package chapter12_arrays;

import java.util.Arrays;

public class ArrayTest04 {
    public static void main(String[] args) {
        //0.0초과 1.0 미만 난수 생성 반환
        int sum = 0;
        int sumEven =0;
        int[] numbers = new int[10];
        for(int i=0;i<10;i++){
            numbers[i] = (int)(Math.random()*10)+1;
        }

        System.out.println("배열 전체 : "+ Arrays.toString(numbers));

        for(int j=0;j<10;j++){
            sum = numbers[j]+sum;
        }
        System.out.println("전체 합 : "+sum);

        for(int k = 0;k<10;k++){
            if(numbers[k]%2 ==0){
                sumEven = sumEven + numbers[k];
            }
        }

        System.out.println("짝수합 : "+sumEven);
    }
}
