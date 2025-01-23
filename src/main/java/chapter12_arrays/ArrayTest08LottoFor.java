package chapter12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08LottoFor {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] lottoNumbers = new int[5][6];
        //--> 숫자 6개 뽑는 배열이 5개 있다는 의미
        boolean duplicate;
        int number;

        for(int i = 0;i<lottoNumbers.length;i++){
            for(int j = 0; j<lottoNumbers[i].length;j++){
                duplicate = false;
                number = random.nextInt(45)+1;
                for(int k = 0;k<j;k++){
                    if(lottoNumbers[i][k] == number){
                        duplicate = true;
                    }
                }
                if (duplicate){
                    j--;
                }else{
                    lottoNumbers[i][j] = number;
                }
            }
            Arrays.sort(lottoNumbers[i]);
            System.out.println(Arrays.toString(lottoNumbers[i]));

        }

    }
}
