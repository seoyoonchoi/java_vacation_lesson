package chapter12_arrays;
/*
String[] names 배열을 선언하고 출석부에 이름을 입력하여 names 배열에 집어넣는 프로그램 작성하기
 */

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] thisAges = new int[5];

        thisAges[0] = 38;
        thisAges[1] = 32;

        System.out.print("몇 명의 학생을 등록하시겠습니까 : ");
        int howManyStudent = scanner.nextInt();
        String[] thisName = new String[howManyStudent];

        for(int i = 0; i<howManyStudent ;i++){
            System.out.print((i+1) + "번 학생 이름 : ");
            thisName[i] = scanner.next();
        }

        for(int j = 0; j<howManyStudent;j++){
            System.out.println((j+1)+". "+thisName[j]);
        }
    }
}
