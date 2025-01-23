package chapter12_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //배열 전체 출력 방법
        System.out.println(Arrays.toString(arr));
        Integer[] arr2 = {2,3,1,4,5};
        //오름차순 비열
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //내림차순배열
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        //Comparator.reverseOrder()메서드를 적용하기 위해서 제네릭이라는 개념인 <T>가 요구되는데
        //T는 기본자료형 불가 클래스여야만 한다. 따라서 int->integer로 바꿔야한다


    }
}
