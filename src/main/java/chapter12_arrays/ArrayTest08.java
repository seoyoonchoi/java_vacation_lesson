package chapter12_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayTest08 {
    public static void main(String[] args) {

        //랜덤 클래스 import

        Random random = new Random();
//        int lottoNumbers[][] = new int[5][6];
//        for(int i = 0;i<5;i++){
//            for(int j = 0;j<6;j++){
//                lottoNumbers[i][j] = random.nextInt(45)+1;
//                if(lottoNumbers[i][j]==lottoNumbers){
//                    j--;
//                    continue;}
//            }
//        }

        int n =0;
        while(n<5) {

            int[] lottoNumbers = new int[6];
            Set<Integer> uniqueNumbers = new HashSet<>();
            for (int i = 0; i < lottoNumbers.length; i++) {
                //Set<Integer> uniqueNumbers = new HashSet<>();A
                lottoNumbers[i] = random.nextInt(45) + 1;
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
            n++;
        }





    }
}
